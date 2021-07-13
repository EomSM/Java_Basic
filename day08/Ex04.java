package day08;

//final 키워드
/*
1. 클래스에 사용하는 경우  : 상속을 금지함. 
파이널 설정된 클래스는 다른 클래스의ㅏ 자식 클래스는 될 수 있으나 조상 클래스는 될 수 없음.

2. 메소드에 사용하는 경우 파이널로 설정된 메소드는 자식클래스에서 오버라이드 할 수 없다. 

3. 변수에 사용하는 경우 : constant 상수가 됨. 파이널 변수는 초기화한 후 값을 변경할 수 없음.
*/
final class FinalA{}
//class ChildA extends FinalA{}
//The type ChildA cannot subclass the final class FinalA

class FinalB{
	 public final void display() {
		System.out.println("final void display()");
	}
}

class childB1 extends FinalB{
//	@Override
//	public final void display(){ 
//		System.out.println( "final void display() in childB");
//	}
	
	//Cannot override the final method from FinalB
}


class FinalC{ 
	public int num1;
	public int num2=22;
//파이널변수는 선언할 때에 반드시 초기화해 주어야 함.
	
	//1) 멤버변수를 선언하면서 초기화하는 경우
	public final int num3=33;
//2) 생성자에서 초기화하는 경우
	public final int num4;
	public FinalC(int num4) {
		this.num4 = num4;

	}

	@Override
	public String toString() {
		return num1 + ", "  + num2 + ", "  + num3 + ", " + num4;
	}
	
}


public class Ex04 {

	public static void main(String[] args) {
		FinalC fc1=new FinalC(123);
		FinalC fc2=new FinalC(456);
		FinalC fc3=new FinalC(789);
		
		System.out.println(fc1);
System.out.println( fc2);
System.out.println(fc3);
	}	// main

}//class Ex04
