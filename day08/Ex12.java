package day08;

//adapter class _ 여러개중 몇 개만 사용할 때에 편리하게 이용 가능

abstract class Parent3 {
	public void test1() {
	}

	public void test2() {
	}

	public void test3() {
	}

	public void test4() {
	}

	public void test5() {
	}

	public void test6() {
	}

	public void test7() {
	}

	public void test8() {
	}

	public void test9() {
	}

	public void test10() {
	}
}// parent3
//더미 메소드 구현

class AdapterClass extends Parent3 {
	public AdapterClass() {
	}
}

class Child4 extends AdapterClass {
	public void test3() {
		System.out.println("test3() in Child4 ");
	}

	public void test5() {
		System.out.println("test5() in Child4 ");
	}
}// child4

class Child5 extends AdapterClass {
	public void test1() {
		System.out.println("test1() in Child5 ");
	}

	public void test2() {
		System.out.println("test2() in Child5 ");
	}
}// child5

public class Ex12 {
	public static void main(String[] args) {
		Parent3 p = new Child4();
		p = new Child5();

		p.test1();
		p.test2();
		p.test3();
		p.test4();
		p.test5();
		p.test6();
		p.test7();
		p.test8();
		p.test9();
		p.test10();

	}// main
}// ex12
