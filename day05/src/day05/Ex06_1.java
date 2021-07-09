package day05;

public class Ex06_1 {

	static int number1;

	public static void main(String[] args) {

		// The local variable number may not have been initialized : 변수 초기화 해라

		int number2 = 222;
		System.out.println(number2); // 222
		System.out.println(number1); // 0

// 멤버변수는 자동초기화가 지원이 됨. 사용 전 별도 명시적 초기화 하지 않아도 됨. 
// 지역변수는 명시적 초기화 해야 함	
	}

}
