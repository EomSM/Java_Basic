package day06;

/*
클래스 = type = (data를 관리하는 공간의 크기와 모양)
eg. class a : int4byte int 4byte = 8byte짜리 크기
사용자 정의 타입 - user defined type 

*/

class A {
	int num1, num2;

	@Override
	public String toString() {
		return "A [num1=" + num1 + ", num2=" + num2 + "]";
	}
}

class B {
	int id; // 0
	float weight;// 0.0
	boolean student; // false
	A a;
}// null로 초기화되어있음

public class Ex04 {

	public static void main(String[] args) {
		A a1 = new A();
		B b1 = new B();
		System.out.printf("%d-%d%n", a1.num1, a1.num2);
		System.out.printf("%d--%.2f--%b--%s%n", b1.id, b1.weight, b1.student, b1.a);

		b1.id = 22;
		b1.weight = 34.55F;
		b1.student = true;
		b1.a = new A();
		// b 클래스 내에 a 클래스 타입으로 : 객체의 주소 해시코드만 넣을 수 있음 ;
		System.out.printf("%d--%.2f--%b--%s%n", b1.id, b1.weight, b1.student, b1.a);

		System.out.println("---------------------");
		returnTest();
		A a2 = method2(); // <== new A();
		System.out.printf("a2.num1 : %d%n", a2.num1);
		System.out.printf("a2.num2 : %d%n", a2.num2);
		System.out.println("---------------------");
		
		B b2 = method3(); // <== new B()
		System.out.printf("b2.id: %d,%n b2.weight: %.2f,%n b2.student: %b,%n b2.A: %s%n", b2.id, b2.weight, b2.student, b2.a);
	
	}// main

	public static A method2() {

		A a = new A(); // 객체 생성.
		a.num1 = 123;
		a.num2 = 456;
		return a;
		// return new A();
	}// 클래스형으로 타입 = > num1, num2가 합쳐진 상태의 A타입으로 메모리에 올려놓음.
		// A 클래스의 객체.

	public static B method3() {
		B b = new B();
		b.id = 789; // 0
		b.weight = 50.1F;// 0.0
		b.student = false; // false
		b.a = new A();
		b.a.num1 = 333;
		b.a.num2= 555;
		return b;
		// return new B();
	}

	public static int method1() {
		return 111;
	}

	public static void returnTest() {
		System.out.println("Hello Java");

		if (10 < 3) {
			return;// 조건이 맞으면 메소드의 실행 종료, 호출한 곳으로 돌아감
		} // dead code

		System.out.println("Hello Java");
		System.out.println("Hello Java");
		return;
	}

}
