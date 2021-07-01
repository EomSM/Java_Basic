package day01;

public class Ex02 {
	public static void main(String args[]) {
		//print	
		System.out.print("안녕하세요. 자바입니다.\n");
		System.out.print("안녕하세요. 자바입니다. print \n:");
		System.out.println("---------------");
		
		System.out.println("안녕하세요. 자바입니다. println");
		System.out.println("---------------");
		
		System.out.printf("%s: %d점%n", "국어", 100);
		System.out.printf("%s: %d점\n", "수학", 98);
		System.out.printf("%s: %d점%n", "영어", 95);

		System.out.printf("%s: %5d점%n", "국어", 100);
		System.out.printf("%s: %5d점\n", "수학", 98);
		System.out.printf("%s: %5d점%n", "영어", 95);

		System.out.printf("%s: %-5d점%n", "국어", 100);
		System.out.printf("%s: %-5d점\n", "수학", 98);
		System.out.printf("%s: %-5d점%n", "영어", 95);

		System.out.println("---------------");

	}

/*printf : format : 형식, 방식 <- C언어에서 옴. 자동줄바꿈 안됨.
 *  => %n \n 중 하나 사용 가능  
	format specifier : 형식 지정자(%)를 사용.
 %s String 문장. 문자열
 %c Character 한글자. 문자
 %d Decimal 정수
 %f Floating Point 실수	

 %5d : 우측정렬
 %-5d : 좌측정렬, 점수만 빼고 숫자만. 
	"서식문자"

*/	
	

}
