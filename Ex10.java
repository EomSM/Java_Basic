package day01;

public class Ex10 {

	public static void main(String[] args) {

		long result1 = 1000000 * (long) 1000000;
		long result2 = 1000000 * 1000000L;

		System.out.printf("result1: %d%n", result1);
		System.out.printf("result2: %d%n", result2);

		int result3 = 1000000 * 1000000 / 1000000;
		System.out.printf("result3: %d%n", result3);
		//int로 형을 정했기 때문에 출력된 결과가 원하는 결과 아님
		result3 = 1000000 / 1000000 * 1000000;
		System.out.printf("result3 연산 순서 변경: %d%n", result3);
		//result 3이 int=> long으로 형변환 되어야 원하는 결과 나옴
	}

}
