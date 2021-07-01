package day01;

public class Ex13 {

	public static void main(String[] args) {

		int number;
		number = 10;

		// Duplicate local variable number
		// int number=22;

		// 논리 연산자 :
		// &&(AND): 모두 참이어야 True 하나라도 거짓이면 False
		// true && true T
		// true && false F
		// false && true F
		// false && false F

		// || : 하나라도 참이면 True 모두 거짓일 때에만 False
		// true || true T
		// true || false T
		// false || true T
		// false || false F

		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && false);

		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || false);

		/* 비교연산자 : = | == !=(! =) (=!)
		 * 비트연산자 : & |
*/		

		System.out.println(false == false);
		System.out.println(false != false);

	}

}
