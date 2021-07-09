package day07;

class C {
	int i;
	float f;

	public C(int i) {
		this(i, 3.14F);
		System.out.println("C(int i)");
	}

	public C(float f) {
		this(5, f);
		System.out.println("C(float f)");
	}

	public C(int i, float f) {
		this.i = i;
		this.f = f;
		System.out.println("C(int i, float f)");
		display ();
 // 생성자에서는 메소드를 호출할 수 있다. 
}

	@Override
	public String toString() {
		return "C [i=" + i + ", f=" + f + "]";
	}
	
	
	public void display() {
		//this(4.343.3F);
		//디스는 일반 메소드에서 사용할 수 없다. 생성자 호출 불가..
	}

}

public class Ex04 {

	public static void main(String[] args) {
		System.out.println("프로그램 동작 시작");
		C c1=new C(100);
		System.out.println(c1);
		System.out.println("==============");
		
		C c2=new C(6.25F);
		System.out.println(c2);
		System.out.println("==============");
		
		
		C c3=new C(555, 46.432F);
		System.out.println(c3);
		System.out.println("프로그램 종료");
		
	}

}
