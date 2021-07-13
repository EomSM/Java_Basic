package day08;
//싱글톤 패턴

//클래스의 하나의 객체만 생성해 사용함...
public class Ex05 {
	public static void main(String[] args) {
		SingletonClass sc1 = SingletonClass.getInstance();
		SingletonClass sc2 = SingletonClass.getInstance();
		SingletonClass sc3 = SingletonClass.getInstance();
		SingletonClass sc4 = SingletonClass.getInstance();
		System.out.println(sc1);
		System.out.println(sc2);
		System.out.println(sc3);
		System.out.println(sc4);
		
	}

}

class SingletonClass {

	private static SingletonClass s;

	private SingletonClass() {
	}

	public static SingletonClass getInstance() {
		if (s == null) {
			s = new SingletonClass();

		}
		return s;
	}

}
