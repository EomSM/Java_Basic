package day07;

class B {
	int num1, num2, num3;
	public B() { 	}
	public B(int num1) {
		this.num1 = num1;

	}

	public B(int num1, int num2) {
		// this.num1 = num1;
		this(num1);
		this.num2 = num2;

	}

	public B(int num1, int num2, int num3) {
//		this.num1 = num1;
//		this.num2 = num2;
		this(num1, num2);
		this.num3 = num3;

	}

	@Override
	public String toString() {
		return "B [num1=" + num1 + ", num2=" + num2 + ", num3=" + num3 + "]";
	}
}

public class Ex03 {

	public static void main(String[] args) {
		B b1 = new B(11);

		System.out.println(b1);

		B b2 = new B(1, 12);
		System.out.println(b2);

		B b3 = new B(55, 66, 77);
		System.out.println(b3);
	}

}
