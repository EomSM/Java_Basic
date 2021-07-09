package day06;
//static method : 객체 생성 전에 method area에서 활성화 상태가 됨

public class Ex09 {
	int iv;
	static int cv;

	public static void staticMethod1() {
		System.out.println("staticMethod1()");
	}

	public void instanceMethod1() {
		System.out.println("instanceMethod1()");
	}

	public static void staticMethod2() {
		System.out.println("staticMethod2()");
		System.out.println("cv : " + Ex09.cv);
		cv = 222;
		System.out.println("staticMethod2()");
		System.out.println("cv : " + Ex09.cv);
		staticMethod1();

		// iv = 555;
		// Cannot make a static reference to the non-static field iv
		// instanceMethod1();
		// Cannot make a static reference to the non-static method instanceMethod1()
		// from the type Ex09
		// 인스턴스 변수들 = 객체 생성 후 사용 가능 -> 향후 사용을 위해 메모리에서 활성화되어야 함

		Ex09 ex9 = new Ex09();
		ex9.iv = 555;
		System.out.println("ex9.iv : " + ex9.iv);
		ex9.instanceMethod1();
	}

	public void instanceMethod2() {
		System.out.println("instanceMethod2()");
		cv = 777;
		System.out.println("cv :" + cv);
		staticMethod1();
		iv = 999;
		System.out.println("iv: " + iv);

	}

	public static void main(String[] args) {
		staticMethod2();

	}

}
