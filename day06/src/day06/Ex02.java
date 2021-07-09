package day06;

import java.util.Scanner;

//CBReference

//재확인 필요!
public class Ex02 {

	public static void main(String[] args) {
		int students = getStudentNumbers();
		int subjects = getSubjectNumbers();
		int[][] scores = new int[students][subjects];
		inputStudents(scores);
		outputScores(scores);

	}// main
//학생 수 입력 메소드 : 이차원 배열의 행	row

	public static int getStudentNumbers() {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생수 입력 : ");
		return sc.nextInt();
	}

//과목 수 입력 메소드	: 이차원 배열의 열 column
	public static int getSubjectNumbers() {
		Scanner sc = new Scanner(System.in);
		System.out.print("과목수 입력 : ");
		return sc.nextInt();
	}

// 학생 선택하기 inputStudents
	// 매개변수 : 이차원 배열
	// return 값 없음 => return type void
	public static void inputStudents(int[][] scores) {
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%d번째 학생의 성적을 입력합니다%n", i+1);
			inputScores(scores[i]);

		}
	}

	// 과목별 성적 입력 inputScores
	// 매개변수 : 일차원 배열. return 값 없음 => void
	public static void inputScores(int[] score) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < score.length; i++) {
			do {
							System.out.printf("%d 번째 성적을 입력하세요 :", i+1);
							score[i] = sc.nextInt();
				} while (score[i] < 0 || 100 < score[i]);
			// score[i] <0 || 100 <score[i] 이 true 일 때에만 반복 : 성적이 잘못 입력된 경우만.

		}
	}

	// 성적(학생번호, 총점, 평균_) 출력하기 메소드.
	// 2차원 배열의 매개변수를 받아서
	// return 값 없음 => return type void
	public static void outputScores(int[][] scores) {
		System.out.println("====================================");
		System.out.println("성적을 출력합니다 ");
		System.out.println("====================================");

		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%d 번째 학생은 총점 %d점, 평균 %.2f점입니다.%n", i + i, getTotal(scores[i]), getAverage(scores[i]));
		}
		System.out.println("====================================");

	}

	// 총점
	// 매개변수 : 일차원 배열
	// return 값 총점 (int) => return type int
	public static int getTotal(int[] score) {
		int total = 0;
		for (int i = 0; i < score.length; i++) {
			total += score[i];
		}
		return total;
	}

	// 평균
	// 매개변수 : 일차원 배열
	// return 값 : 평균 (float) => return type float
	public static float getAverage(int[] score) {
		float average = getTotal(score) / score.length;
		return average;
	}

}// c