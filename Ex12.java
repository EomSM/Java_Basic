package day01;

public class Ex12 {

	public static void main(String[] args) {

		// ++() 연산자가 단독으로 사용되는 경우에는 변수 앞/뒤에 있는 결과 동일
		// 다른 연산자가 함께 사용되는 경우에는 앞뒤 위치에 따라 결과가 달라진다.

		// printf로 출력시 서식문자에서 값이 할당되는 것 역시 연산 중 하나.
		// => ++이 먼저 이뤄진 후 할당 연산이 됨
		int score;
		score = 11;
		System.out.printf("score : %d%n", score);
		int score2 = score++;
		System.out.printf("score : %d, score2 : %d%n", score, score2);
		/*
		 * score : 11 score : 12
		 */

		int score3 = 11;
		System.out.printf("score3 : %d%n", score3);
		int score4 = ++score3;
		System.out.printf("score3 : %d, score4 : %d%n", score3, score4);

		int num = 10;
		System.out.printf("%d %d %d %d %d %d%n", num++, ++num, num--, ++num, num++, num);
//10 12 12 12 12 13
	}

}
