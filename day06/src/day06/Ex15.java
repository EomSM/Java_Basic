package day06;

class C {
	int i;
	float f;

	public C() {
		System.out.println("C() 기본 생성자");
	}

	public C(int i, float f) {
		System.out.println("C(int i, float f) 매개변수 있는 생성자");
		this.i = i;
		this.f = f;
	}

	public C(float f, int i) {
		System.out.println("C(float f, int i) 매개변수 있는 생성자");
		this.i = i;
		this.f = f;
	}

	public C(int i) {
		System.out.println("C(int i) 매개변수 있는 생성자");
		this.i = i;

	}

	public C(float f) {
		System.out.println("C(float f) 매개변수 있는 생성자");
		this.f = f;
	}

	public C(int num1, int num2, int num3) {
		System.out.println("C(int num1, int num2, int num3) 매개변수 있는 생성자");
//		this.num1 = num1;
//		this.num2 = num2;
//		this.num3 = num3;

	}

	@Override
	public String toString() {
		return i + "--" + f;

	}

}

public class Ex15 {

	public static void main(String[] args) {
		System.out.println(new C());
		C c1 = new C();
		System.out.println(c1);

		C c2 = new C(11, 22, 33);
		System.out.println(c2);
		C c3 = new C(11, 1.2F);
		System.out.println(c3);
		
		C c4 = new C(57.24F, 33);
		System.out.println(c4);
		
		C c5 = new C (4);
		System.out.println(c5);
		
		C c6 = new C (34.67F);
		System.out.println(c6);
	
	
	
	
	
	
	
	
	
	}

}
