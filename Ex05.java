package day01;

public class Ex05 {

	public static void main(String[] args) {

		float f1;
		f1 = (float) 3.141592;
		f1 = 3.141592F;// 대문자
		f1 = 3.141592f;// 소문자
		System.out.println(f1);
		// float => 더블(8)을 플롯(4)으로 저장되는 형태 : 에러 발생하지 않게 지정해야
		// 플롯 공간에 저장 됨

		double d1;
		d1 = 6.25;
		d1 = (double) 6.25;
		d1 = 6.25d;
		d1 = 6.25D;
		// double은 이렇게 안해도 됨
		System.out.println(d1);
		System.out.println("==========");
		
		
		char ch;
		ch = 'G';

		ch = (char) (ch + 32);
		System.out.println(ch);

		// ch를 대문자에서 소문자로
		// 대문자 G = 71, +32(=소문자로 변환하는 규칙) = 103
		// 결과는 int인데 char에 넣어서 형변환. => 소문자 g가 됨.
		// cf. ASCII code
		// 'A'(65), 'a'(97), '0'(48)

		System.out.println("==========");

		char chA = 'A';
		char chB = 'B';

		System.out.println(chA + chB);
		System.out.println(chA - chB);

		System.out.println("==========");
		
		int num=10;
		num=num+1;
		System.out.println(num);
		
		/*
		 * 연산자 int type 이하 type의 연산 연산 되는 대상의 값이 모두 int type로 변환되어 연산됨. => int type 이상의
		 * type들 연산 : 연산의 대상이 되는 type 중 가장 큰 type으로 변환되어 연산
		 */

		// 4byte지만 float가 8byte인 long보다 더 많은 수를 표현할 수 있다.
		// f가 L보다 더 큰 자료형으로 여겨진다.
		// =>F가 int보다 더 큰 타입으로 여겨짐
		// 연산되어지는 타입들 중에서 제일 큰 것으로 => float으로 변경이 된다.

		// 형변환 : casting

	}

}
