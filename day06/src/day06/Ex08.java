package day06;

import java.util.Arrays;

class ReturnClass {
	int number1;
	int number2;

	@Override
	public String toString() {
		return "ReturnClass [number1=" + number1 + ", number2=" + number2 + "]";
	}

}

public class Ex08 {

	public static void main(String[] args) {
		int result = add(11, 22);
		System.out.println(result);

		ReturnClass rc1 = method1();
		System.out.println("" + rc1);
		rc1.number1 = 111;
		rc1.number2 = 222;
		System.out.println("" + rc1);

		int[] nums = returnArray1();
		System.out.println(Arrays.toString(nums));
		nums[1] = 555;
		System.out.println(Arrays.toString(nums));

		int[][] numbers = returnArray2();
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.deepToString(numbers));

	}// main

	public static int add(int num1, int num2) {
		int num3 = num1 + num2;
		return num3;

	}

	// ref타입을 반환하는 메소드 1) class type 반환
	public static ReturnClass method1() {
		ReturnClass rc = new ReturnClass();
		rc.number1 = 176;
		rc.number2 = 244;
		return rc;
	}

	// 2) array data 반환 메소드
	public static int[] returnArray1() {
		int[] numbers = new int[] { 1, 2, 3 };

		return numbers;

	}

	public static int[][] returnArray2() {
		int[][] numbers = new int[3][2];
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				numbers[i][j] = ++count;
			}
		}
		return numbers;
	}

}// Ex08 class
