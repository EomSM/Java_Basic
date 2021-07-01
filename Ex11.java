package day01;

public class Ex11 {

	public static void main(String[] args) {
		// 증감연산자 : ++, --\
		// 변수 공간 속에 저장된 값을 변경시키려면 할당 연산자를 사용해야 하지만,
		// 증가연산자, 감소연산자를 사용하면 할당연산자를 사용하지 않더라도
		// 변수공간 속에 저장된 값은 1 + - 할 수 있음.

		int number = 10;
		System.out.printf("number : %d%n", number);
		number++;
		System.out.printf("number : %d%n", number);
		++number;
		System.out.printf("number : %d%n", number);
		number--;
		System.out.printf("number : %d%n", number);
		--number;
		System.out.printf("number : %d%n", number);

		System.out.println("------------ +_ 1");

		int score = 11;
		System.out.printf("score : %d%n", score);
		score = score + 1;
		System.out.printf("score : %d%n", score);
		score += 1; // 복합할당연산자
		System.out.printf("score : %d%n", score);
		score = score - 1;
		System.out.printf("score : %d%n", score);
		score -= 1; // 복합할당연산자
		System.out.printf("score : %d%n", score);

		System.out.println("------------ +_ 2");
		score = score + 2;
		System.out.printf("score : %d%n", score);
		score += 2; // 복합할당연산자
		System.out.printf("score : %d%n", score);
		score = score - 2;
		System.out.printf("score : %d%n", score);
		score -= 2; // 복합할당연산자
		System.out.printf("score : %d%n", score);


	}

}
