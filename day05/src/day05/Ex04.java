package day05;

public class Ex04 {
	/*변수의 생명주기 : life cycle
	변수는 선언된 scope= 범위 (역시 메모리 속에 있는 것임 )
 해당 변수가 선언된 스코프가 해제되면 해당 변수도 메모리에서 삭제됨.
*/
/*
	메소드의 괄호 부분 = 공간 확보 = 실행된 후  종료 = 확보된 공간이 없어짐. 
	
	1. 멤버변수 : 클래스 내부, class scope에서 선언됨. 클래스의 instance가 heap 메모리에 로딩되어 있는 동안 heap 메모리에 생성됨.
	2. 지역변수1 : 메소드 내부, method scope에서 선언됨. 메소드가 실행될 때 call stack메모리에 로딩됨. 메소드가 종료되면 call stack 메모리에서 삭제(해제)됨.
	3. 지역변수2 : 메소드 내부의 또다른 code block(scope)에 선언된 변수 - for, while, if 등...  
	
	
	
	
	
	*/
	

	int number1; 
	//class scope안에 있지만 개별 method에 속한 것 아님 : 멤버 변수 
	//member variable =  member field = field
	
	//클래스 스코프에서 정의된 메소드 : 멤버 메소드
	public static void main(String[] args) {
		int number2=111;
		int figure=333; 
		//지역변수들
		
		System.out.println(number2);
		System.out.println(figure);
	
		
		for (int i = 1; i <=10; i++) {
			System.out.printf("%d ", i);
		}
		System.out.println("\n=====================");
		
		if(figure ==333) {
			System.out.println("참 입니다");
			int result = number2 + figure;
			System.out.println(result);
		}
		
		
		
	}//main - local 변수/매서드
	
	
	public static int add(int num1, int num2) {
		int result=num1 + num2;
		return result;
	}//add - 파라미터 : 값을 받아 저장. 하는 것도 local 영역 내에서. 지역변수. 

}//c - global 
