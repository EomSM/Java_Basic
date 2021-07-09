package day07;
/*
초기화블럭 = { }
객체가 생성될 때, 생성자보다 먼저 실행되는 블럭
(static) 초기화 블럭
: 객체의 생성과 관계없이  Method Area에서 활성화되는 블럭
*/

class InitBlock {
	static int cv = 1;// static 멤버변수
	int iv = 1; // instance 멤버변수
	static {
		cv = 2;

	}// static 초기화 블럭

	// instance 초기화 블럭
	{
		//iv = 2;
		cv = 3;
	}
	// 생성자
	public InitBlock() {
		//iv = 3;
		cv = 4;
	}
}

public class Ex09 {

	
	public static void main(String[] args) {

//static 멤버변수 초기화
		System.out.println(InitBlock.cv); //cv=1;

//static 초기화 블럭 실행
		System.out.println(InitBlock.cv); //cv=2;

	//instance 멤버변수 초기화 iv: 1

		 
		// instacne 초기화블럭 실행 " iv2 : 
		System.out.println(InitBlock.cv); //cv=2;

		
		//		System.out.println(InitBlock.iv);
		// 생성자가 호출(실행됨)
		InitBlock ib = new InitBlock();
		System.out.println(ib.iv); //3
		System.out.println(InitBlock.cv);//4
	}
}
