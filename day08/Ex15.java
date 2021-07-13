package day08;

/*
 interface인터페이스
 다형성과 다중상속을 위해서 사용하는 문법 
 	1. (원칙적으로) 모든 메소드는 추상 메소드임 : public abstract(생략 가능)
	2. 모든 멤버변수는 public static final임
	3. 생성자를 사용할 수 없음.  - 작성도 안 됨.
	  ㄴ 추상 클래스에서는 작성은 가능하지만 실행할 수는 없음.
	4. 일반 메소드를 하나라도 가질 수 없음.


*/

interface Inter01 {
	public static final int number1 = 11;
	public static int number2 = 22;
	public int number3 = 33;
	int number4 = 55;

	public abstract void display1();

	public abstract void display2();

	abstract void display3();

	void display4();

}

class ChildInter01 implements Inter01 {
	// 임플리먼트 : 인터페이스가
	public void display1() {
		System.out.println("display1() in ChildInter01");
	}

	public void display2() {
		System.out.println("display2() in ChildInter01");
	}

	public void display3() {
		System.out.println("display3() in ChildInter01");
	}

	public void display4() {
		System.out.println("display1() in ChildInter01");
	}

}

class ChildInter02 implements Inter01 {
	// 임플리먼트 : 인터페이스가
	public void display1() {
		System.out.println("display1() in ChildInter02");
	}

	public void display2() {
		System.out.println("display2() in ChildInter02");
	}

	public void display3() {
		System.out.println("display3() in ChildInter02");
	}

	public void display4() {
		System.out.println("display1() in ChildInter02");
	}

}

class ChildInter03 implements Inter01 {
	// 임플리먼트 : 인터페이스가
	public void display1() {
		System.out.println("display1() in ChildInter03");
	}

	public void display2() {
		System.out.println("display2() in ChildInter03");
	}

	public void display3() {
		System.out.println("display3() in ChildInter03");
	}

	public void display4() {
		System.out.println("display4() in ChildInter03");
	}

}

interface Inter02 extends Inter01 {
}

public class Ex15 {
	public static void main(String[] args) {

		Inter01 inter01 = new ChildInter01();
						inter01.display1();

						inter01 = new ChildInter02();
						inter01.display1();

						inter01 = new ChildInter03();
						inter01.display1();

	}// main
}// Ex15
