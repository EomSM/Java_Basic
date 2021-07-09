package day06;

public class Ex03 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		display();

		int result = method1();
		System.out.printf("result : %d%n", result);

		result = sum(11, 22);
		System.out.printf("result : %d%n", result);

		result = max(11, 22, 3);
		System.out.printf("result : %d%n", result);

		result = min(11, 22, 3);
		System.out.printf("result : %d%n", result);

		result = output();
		System.out.printf("result : %d%n", result);

		result = sum(output(), min(323, 5, 8888));
		System.out.printf("result : %d%n", result);
		
		
		result = max(34, min(32,5, 687), 9);
		System.out.printf("result : %d%n", result);

		
		System.out.println("프로그램 종료");
	}

	public static void display() {
		System.out.println("display() 호출");
	}

	public static int method1() {
		return 111;
	}

	public static int sum(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}

	public static int max(int num1, int num2, int num3) {
		int max;
		max = (num1 > num2 && num1 > num3) ? num1 : (num2 > num3) ? num2 : num3;
		return max;
		// 삼항연산자
	}

	public static int min(int num1, int num2, int num3) {
		int min;
		min = (num1 < num2 && num1 < num3) ? num1 : (num2 < num3) ? num2 : num3;
		return min;
		// 삼항연산자
	}

	public static int output() {
		return min(1, 43, 46);
	}

}// class
