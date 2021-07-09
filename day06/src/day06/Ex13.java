package day06;

/*
생성자(constructor) : 객체 생성시 멤버 변수를 초기화함. 
 ㄴ 클래스의 멤버변수들을 한번에 메모리에 로딩함. 
  ㄴ 멤버변수를 사용하기 전 초기화 행 하므로
  
메소드의 일종.
 	1)  클래스의 이름과 같은 이름의 메소드
 = 메소드임에도 클래스를 맨 처음을 대문자로 하자는 약속.(낙타표기법)
 	2) 모든 생성자는 return 값이 없음.  return type을 작성하지 않음 :void
	3)객체 생성 이후 참조변수로 호출할 수 없음
	4) new 연산자를 사용하여 호출. : 객체 생성시 호출됨
	5) 클래스 내부에 생성자를 하나도 작성하지 않으면> compile시 기본 생성자가 자동으로 추가됨
	5_1) 기본 생성자를 작성하지 않고 매개변수 있는 생성자를 하나라도 작성하면 컴파일러가 자동으로 기본생성자를 추가하지 않음
	6) 오버로딩 가능
	7) 생성자 내부에서 this()형식으로 같은 클래스 안에 있는 다른 생성자 호출 가능.
	8) 생성자 내부에서 다른 생성자를 호출하는 코드[this()]는 생성자의 맨 첫줄에서 작성해야만 한다. 
클래스 맴버 변수 사용. 클래스 안의 변수. 사용 전 초기화 필요. 
초기화 하는 것이 생성자. 


*/

class Student {
	String name;
	int age;

	Student() {
		this("ABC");
	}

	Student(String name) {
		this("ABC", 21);
	}

	Student(String name, int age) {

	}

}

public class Ex13 {

	public static void main(String[] args) {

		new Student();

	}

}
