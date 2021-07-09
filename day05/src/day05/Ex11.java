package day05;

class Time {
	int hour;
	int minute;
	int second;

//	public void display() {
//		System.out.printf("%d--%d--%d%n", hour, minute, second);
//	}

	@Override
	public String toString() {
		return "Time [" + hour + "시" + minute + "분" + second + "초]";
	}
	// toString 내부는 가공조절할 수 있다
}

public class Ex11 {

	public static void main(String[] args) {
		Time t1 = new Time();
		t1.hour = 10;
		t1.minute = 30;
		t1.second = 20;
//		t1.display();
		System.out.println(t1.toString());
		System.out.println(t1);

		
		
		int[] numbers = { 1, 2, 3, 4, 5 };
		String[] names = { "john", "tom", "jane" };
		// {"richard","george","john1","john2","james","noah","thomas"};
		// String 은 ref 이기 때문에 힙메모리에 저장해놓고 객체의 주소만 저장되어짐.
		// Time[] times= {t1.hour, t1.minute, t1.second};
//클래스타입의 배열의 출력 : 주소만이다....
	}

}
