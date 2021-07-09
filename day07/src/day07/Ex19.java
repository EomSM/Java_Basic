package day07;
//override

class AAA {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}

class BBB {

}

/*
 * 
 * method Overriding 부모클래스에서 상속받은 메소드를 자식클래스에서 자식클래스에 맞게 재정의하는 것. ㄴ body 부분의 내용을
 * 바꾸는 것.
 * 
 * 부모클래스의 메소드 선언부와 자식클래스의 메소드의 선언부가 일치해야 함.
 * 
 * 접근제한자 return type 메소드 이름( 매개변수) ㄴ 접근제한자의 범위가 부모 클래스보다 좁을 수 없음
 * 
 * 
 */

public class Ex19 {
	class Animal {
		
		public void sound() {
			System.out.println("소리내다");
		}
	}

		class Cat extends Animal {

		}

		class Dog extends Animal {

		}

	public static void main(String[] args) {

		Cat cat = new Cat();
		Dog dog = new Dog();
		
		cat.sound();
		dog.sound();
	}
}