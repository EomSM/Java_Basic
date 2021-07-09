package day05;

public class Ex12 {

	public static void main(String[] args) {
		//메소드 호출 방법 : 메소드 이름 (argument_)  : 매개변수의 개수, 순서, 타입에 맞춰 넣어줌.

System.out.println(add(add(5,7),9));
	}

	public static int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
		
		//return 키워드, 리턴값 : 리턴값을 자신이 호출된 부분으로 다시 보내줌 
	}

}
