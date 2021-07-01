package day01;

public class Ex06 {

	public static void main(String[] args) {

		char ch = 'F';
		System.out.println("최초 ch : " + ch);

		// ASCII 코드 이용한 대소문자 변환

		System.out.println("int 전환 ch : " + (ch + ('a' - 'A'))); // 숫자
		System.out.println("char ch : " + (char) (ch + ('a' - 'A'))); // 소문자
		System.out.println("최종 ch : " + ch); // 연산을 다 담지 않아서 최초의 값에서 변경되어 나타나지 않음
		// 할당 연산을 하지 않으면 해당 변수 공간 속에 저장되어 있는 값은 변경되지 않는다
	}

}
