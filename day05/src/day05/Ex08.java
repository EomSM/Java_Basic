package day05;

/*
클래스 = 멤버변수  +    멤버 메소드
         속성property    동작-함수
         상태status      method

heap에 할당할 필요없이 메모리에 있다가 호출이 되어 실행이 되게 바로 준비해놓는 것.


*/
public class Ex08 {

	public static void main(String[] args) {

		Student std1 = new Student();
		System.out.println(std1.name);
		System.out.println(std1.age);
		std1.name = "이순신";
		std1.age = 48;
		System.out.println(std1.name);
		System.out.println(std1.age);

		Student std2 = new Student();
		System.out.println(std2.name);
		System.out.println(std2.age);
		std2.name ="유관순";
		std2.age = 19; 
		System.out.println(std2.name);
		System.out.println(std2.age);

	
		std1.see();
		std2.see();
		
		
		std1.study();
		std2.walk();
		
		std1.introduce();
		std2.introduce();
		
		
		Teacher t1 = new Teacher();
		
		t1.name="강감찬";
		t1.age=72;
		t1.height=192;
		t1.weight=89;
		
		System.out.println(t1.name);
		System.out.println(t1.age);
		System.out.println(t1.height);
		System.out.println(t1.weight);

		Teacher t2 = new Teacher();
		Teacher t3 = new Teacher();
		Teacher t4 = new Teacher();
		Teacher t5 = new Teacher();
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
		System.out.println(t5);
		
	}//main
}//c Ex08

class Student {

	String name;
	int age;

	public void see() {
		System.out.println(name + "이 봅니다.");
	}

	public void walk() {
		System.out.println(name + "이 걷습니다.");
	}

	public void study() {
		System.out.println(name + "이 공부합니다.");
	}

	public void introduce() {
		System.out.printf("%s, %d%n", name, age);
	}
}// 학생 클래스

class Teacher {
	String name;
	int age;
	int height;
	int weight;

}// c
