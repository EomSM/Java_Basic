package day07;

class A {
	int i;
	float f;

	public A() {
		System.out.println("A()");

	}

	public A(int i, float f) {
		System.out.println("A(int i, float f)");
		this.i = i;
		this.f = f;
	}

	public A(float f, int i) {
		System.out.println("A(float f, int i)");
		this.f = f;
		this.i = i;
	}

	public A(int i) {
		System.out.println("A(int i)");
		this.i = i;
	}

	public A(float f) {
		System.out.println("A(float f)");
		this.f = f;
	}

}

public class Ex01 {

	public static void main(String[] args) {
		A a1 = new A();

		A a2 = new A(34, 3.4F);

		A a3 = new A(4.5F, 33);

		A a4 = new A(17);

		A a5 = new A(7.63F);
	}

}
