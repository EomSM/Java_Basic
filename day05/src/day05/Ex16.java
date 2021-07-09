package day05;

//call by reference
//배열변수 _= 레퍼런스 => int[]의 주소를 가져옴
//Read O Write O 
//원본의 값을 변경함

public class Ex16 {

	public static void method01(int[] number) {
		number[0] = 5555;
		System.out.println("number[0]" +number[0]);
		return; 
		//
		//5555를 받은 넘버인데 리턴해줌으로써 종료 : 메모리에서 삭제됨
	}

	public static void main(String[] args) {
		int[] number = {1,2,3,4,5};
		System.out.println("----method01(int[] number) 호출 전----");
		for (int i = 0; i < number.length; i++) {
			System.out.printf("%d ", number[i]);
		}
		System.out.println("\n------------------");
		System.out.println("number in main( ) : " + number);

		method01(number);
		System.out.println("----method01(int[] number) 호출 후----");
		for (int i = 0; i < number.length; i++) {
			System.out.printf("%d  ", number[i]);
		}
		System.out.println("\n------------------");
		System.out.println("number in main( ) : " + number);

		
		//call ; 실제 value를 보냄 : call by value
		//불러오는 거 : 그냥 복붙....
	}

}
