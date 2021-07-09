package day06;

/*
정적 멤버 변수 static member variable
객체를 생성하기 전에 method area에서 초기화. 
참조변수가 생성되지 않은 상태라 클래스 이름으로 접근하여 사용.
클래스 내에서 하나만 생성됨. 
한 클래스의 객체가 여러개 생성된 후 각 객체에서도 접근해서 사용 가능.
static member는 클래스 이름으로 접근해서 사용하는 것을 권장.
(각 객체에서 정적멤버변수에 접근해서 값을 변경하면 모든 객체에 영향을 미침)

정적변수는 클래스변수, 공유변수라고도함. 
*/

class Variables {
	int iv; // instance variable(인스턴스 멤버 변수)
	static int cv; // class variable(클래스 멤버 변수)

	public void method1() {
		int lv; // local variable(지역변수)
	}
} //V

public class Ex05 {

	public static void main(String[] args) {
		System.out.println("Variables.cv : " + Variables.cv);
//		System.out.println("Variables.iv : " + Variables.iv);
//	Cannot make a static reference to the non-static field Variables.iv

		
		Variables v1 = new Variables();
		v1.iv=300;
		System.out.println("v1.cv : " + v1.cv);
		System.out.println("v1.iv : " + v1.iv);

		
		Variables.cv=123456;
		System.out.println("Variables.cv : " + Variables.cv);
		System.out.println("v1.cv : " + v1.cv); //123456
		
		Variables v2 = new Variables();
		v2.iv=500;
		System.out.println("v2.cv : " + v2.cv); 
		System.out.println("v2.iv : " + v2.iv);
		
		Variables v3 = new Variables();
		v3.iv=700;
		System.out.println("v3.cv : " + v3.cv); 
		System.out.println("v3.iv : " + v3.iv);
		
		v3.cv = 900;
		System.out.println("v3.cv : " + v3.cv); 
		System.out.println("v2.cv : " + v2.cv); 
		System.out.println("v1.cv : " + v1.cv); 
		

		//123456 < 객체 생성 전에 이미 cv에 값이 들어가있었기 때문에.
		//하나의 변수를 계속 사용함을 확인 가능.
	}//main

}//Class
