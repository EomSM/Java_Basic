package day07;

public class Ex05 {

	public static void main(String[] args) {
	
		new D();
	}
}
	class D {
		public D() {
			this(333);
			System.out.println("D()"); //1
		}

		public D(int i) {
			this(3.14F);
			System.out.println("D(int i)"); //2
		}

		public D(float f) {
			this(23.47D);
			System.out.println("D(float f)"); //3
		}

		public D(double d) {
			System.out.println("D(double d)"); //4
		}

	}

