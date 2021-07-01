package day01;

public class Ex09 {

	public static void main(String[] args) {
		int n1 = 1000000;
		int n2 = 2000000;

		int result = n1 * n2;
		long result2 = (long) n1 * n2;

		System.out.println("result : " + result);
		// result : -1454759936
		System.out.println("result2 : " + result2);
		// result2 : %d%n 2000000000000 => 이건 printf 쓸 때에 넣는 타입... 이게 나중에는 더 편하다는듯?

//		format specifier : 형식 지정자(%)를 사용. 
//		%s String 문장. 문자열 
//		%c Character 한글자. 문자 
//		%d Decimal 정수 
//		%f Floating Point 실수 
//		  
//		 
// int 공간 안에서 출력하려 하기 때문에 우리가 원하는 값이 나오질 않음
// long으로 형변환 해 주어야 함 

	}

}
