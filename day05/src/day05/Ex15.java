package day05;

//call by value
//원본의 값을 변경하지 않음
//Read ㅇ, Write X

public class Ex15 {

	public static void method01(int number) {
		number = 5555;
		return; 
		//
		//5555를 받은 넘버인데 리턴해줌으로써 종료 : 메모리에서 삭제됨
	}

	public static void main(String[] args) {
		int number = 10;
		System.out.println("----method01(int number) 호출 전----");
		System.out.println("number in main( ) : " + number);

		method01(number);
		System.out.println("----method01(int number) 호출 후----");
		System.out.println("number in main( ) : " + number);

		
		//call ; 실제 value를 보냄 : call by value
		//불러오는 거 : 그냥 복붙....
	}

}
