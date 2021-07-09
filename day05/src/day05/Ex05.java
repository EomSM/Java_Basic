package day05;

/* 정적변수
 
 콜 스택 메모리 Call stack memory
  : First in First out아닌가 이거
 
1) 지역변수 저장됨.
2) 메소드가 실행될 때 사용하는 공간
3) 변수의 자동 초기화가 지원되지 않음
   ㄴ 지역변수는 사용하기 전에 반드시 명식적 초기화를 거쳐야 함.  
4) 메소드가 종료(콜 스택에서 삭제됨)하면 메소드 속에 선언된 지역변수들도 같이 삭제됨
5) 메소드의 매개변수(파라미터)도 위치상으로는 지역변수(local)임.

메소드 정의하기 : definition ; 메소드가 할 작업의 순서 작성.
	메소드 실행시 외부로부터 값을 받는 부분 : 파라미터(매개변수)




*/
public class Ex05 {

	public static void main(String[] args) {
		int number = 111;
		boolean flag = true;
		char ch = 'A';

		System.out.printf("%d - %b - %c%n", number, flag, ch);
		add(111, 222);
	}//m

	public static int add(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);
		return result;
	}//a
	
	
	
}//c
