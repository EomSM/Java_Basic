package day07;

import java.util.Scanner;

class Student {
	private String name;
	private String[] subjects;
	private int[] scores;
	private int total;
	private float average;

	public Student(String name) {
		this.name = name;// 객체 생성시 전달
		subjects = new String[] { "국어", "영어", "수학" };
		scores = new int[subjects.length];
		total = 0;
		average = 0.0F;
		compute();

	}

	public void compute() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%s 과목의 성적을 입력하세요 : ", subjects[i]);
			scores[i] = sc.nextInt();
			total += scores[i];
		}
		average = (float) total / scores.length;
	}

	public void display() {
		System.out.println("====================");
		System.out.printf("%s 학생의 성적%n", name);
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%-5s : %3d%n", subjects[i], scores[i]);

		}
		System.out.println("====================");
		System.out.printf("총점: %d, 평균 :%f %n", total, average);

	}
}

public class Ex06 {
  public static void main(String args[]) {
  	Student std = new Student("더조은");
  	std.display();

}}
