package day08;
/*추상클래스 = abstract class
메소드 선언부만 있고 바디 구현부가 없는 메소드.. 
 > 호출해도 실행이 되지 않음. 
=> 추상클래스는 객체를 생성할 수 없다.
추상클래스를 상속하는 일반 일반 클래스레서는 부모들로부터 상속받은 추상메소드에서 
구현부를 작성해 주어야 함.
 - 오버라이딩을 강제로 구현해야 함!
 
//오버라이딩의 강제성 : 
부모클래스가 일반 클래스인 경우 이를 상속하는 자식클래스에서
부모클래스에 있는 일반 메소드를 의무적으로 오버라이딩 하지 않는것.

abstract return_type 메소드이름(매개변수_)class;

일반 변수 
return_ type 메소드이름(매개변수){}

"instanceof"연산자 : t/f로 출력. 
왼쪽에 전달된 참조 변수가 실제로 참조하고 있는 인스턴스의 타입이 오른쪽에 전달된 클래스 타입이면 true를 반환하고, 아니면 false를 반환합니다.

만약에 참조 변수가 null을 가리키고 있으면 false를 반환합니다.
*/

abstract class Parent {
	int number = 11;
	float f;

	public void display() {
		System.out.println("display() in Parent");
	}

	public abstract void method1();

	public abstract int add(int num1, int num2);
	}


	class Child1 extends Parent {
		@Override
		public void method1() {
			System.out.println("method1 in Child1");
		}

		@Override
		public int add(int num1, int num2) {
			return num1 + num2;
		}

		@Override
		public void display() {
			System.out.println("display() in Child1");
		}
	}

	class Child2 extends Parent {
		@Override
		public void method1() {
			System.out.println("method1() in Child2");
		}

		@Override
		public int add(int num1, int num2) {
			return num1 + num2 + 1111;
		}

		@Override
		public void display() {
			System.out.println("display() in Child2");
		}
	}

	abstract class Child3 extends Parent {

		@Override
		public void display() {
			System.out.println("display() in Child3");
		}

		@Override
		public void method1() {
			System.out.println("method1() in Child3");
		}

	}

	abstract class GrandChild3 extends Child3 {
		@Override
		public int add(int num1, int num2) {
			return num1 + num2 + 222;
		}

	}

	public class Ex11 {
		public void main(String[] args) {
			// Cannot instantiate the type Child3
			// new Child3();
			Parent p1 = new Child1();
			Parent p2 = new Child2();
//			System.out.println(p1);
			Parent[] p = new Parent[2];

			p[0] = new Child1();
			p[1] = new Child2();

			for (int i = 0; i < p.length; i++) {
				p[i].method1();
				System.out.println(p[i].add(11, 22));
				System.out.println("--------------------------");
			}
		}
	}
