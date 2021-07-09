package day06;

public class Ex12 {

	public static void main(String args[]) {
		int[] arrNums= {1,2,3,4,5};
		method1(arrNums);
		method1(new int[] {11,22,33,44,55});
	}
	
	public static void method1(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.printf("%d ", numbers[i]);
		}
		System.out.println("\n--------------------------------");
	}
	
//new 연산자 사용 = 주소를 얻는 것. 
	//method1에 numbers가 주소를 얻어 ㄱㅏ서
	//배열의 생성과 뭐.... 를 생략할 수 있다고?
	// 할당 연산자 : 배열 선언 = 변수 선언. ㅁㅔ모리에 공간 확보 = 이름표 생성. 
	//int[]을 붙일 장소 구해서 이름 붙임. 
	//변수 선언은 데이터 할당을 받기 위해 공간을 준비하는 것. \

	//parameter의 argument를 뭐....?배열 변수 설정문하고 똑같이 생김 
	//배열변수 설정이랑 초기화 = 생략하ㅏ면 안됨...? 뭔소리야아아아ㅏ
	
	//파라미터 역시 데이터 받으려고 설정하는 것
	
	
	
	
	
	
	
	
	
}
