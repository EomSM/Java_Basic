package day06;

class MathClass {
	long a, b;

	public long add() {
		return a + b;
	}

	public long sub() {
		return a - b;
	}

	public long multi() {
		return a * b;
	}

	public long div() {
		return a / b;
	}

	public static long add(long a, long b) {
		return a + b;
	}

	public static long sub(long a, long b) {
		return a - b;
	}

	public static long multi(long a, long b) {
		return a * b;
	}

	public static long div(long a, long b) {
		return a / b;
	}

}

public class Ex10 {

	public static void main(String[] args) {
		System.out.println("MathClass.add(11, 22) = " + MathClass.add(11L, 22L));
		System.out.println("MathClass.sub(11, 22) = " + MathClass.sub(11L, 22L));
		System.out.println("MathClass.multi(11, 22) = " + MathClass.multi(11L, 22L));
		System.out.println("MathClass.div(11, 22) = " + MathClass.div(11L, 22L));
		System.out.println("===============================================");

		MathClass mc = new MathClass();
		mc.a = 10;
		mc.b = 8;
		System.out.println("mc.add()= " + mc.add());
		System.out.println("mc.sub()= " + mc.sub());
		System.out.println("mc.multi()= " + mc.multi());
		System.out.println("mc.div()= " + mc.div());

		System.out.println(mc.add(10L, 20L));
		;

	}

}
