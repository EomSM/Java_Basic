package day06;

import java.util.Arrays;

public class Ex01 {

	public static String method01(int[] figure) {
		//figure=222; //CBV
		figure[2]=222; //CBR
		return "hello java";
	}
	
	public static void main(String[] args) {
		//int number=11;
			int number[]= {1,2,3,4,5};
		System.out.println("number: "+ Arrays.toString(number));

		String str=method01(number);
		System.out.println("method01(number) : " + str);
		System.out.println("number: "+ Arrays.toString(number));

		//System.out.println("number: "+ number);

		/*
		Call by value의 결과
		number: 222;
		number: 222;
		
		CAll by Reference일 때의 결과
		number: [1, 2, 3, 4, 5]
		number: [1, 2, 222, 4, 5]
		*/ 
			
		
	}

}
