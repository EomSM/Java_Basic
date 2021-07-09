//recursive 재귀메소드

package day06;

public class Ex07 {

	public static void main(String[] args) {
		int resultNumber = FactorialEx.factorial(5);
		System.out.printf("resultNumber : %d%n", resultNumber);

		int result=fac(5);
		System.out.printf("resultNumber : %d%n", resultNumber);

	}// main

	public static int fac(int num) {
		int result = 1;
		for (int i = 0; i < 5; i--) {
			result *= (num - 1);

		} // for
		return result;
	}// fac

	static class FactorialEx {
		public static int factorial(int num) {
			int result = 0;
			if (num == 1) {
				return 1;
			} else {
				result = num * factorial(num - 1);
				// stack에 계속 쌓임 > 실무에서는 속도 느려서 자주 쓰지는 않음.

			}
			return result;
		}// factorial

	}
}// class
