package day07;

class Car2 {
	String color;
	String gearType;
	int door;

	public Car2() {
		this("white", "auto", 4);
	}

	// this: 객체가 생성되었을 때에 위치를 저장하는 참조변수
	// 이걸 사용하는 이유 : 가독성

	public Car2(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}

	public Car2(Car2 car) {
		this.color = car.color;
		this.gearType = car.gearType;
		this.door = car.door;

		// 매개변수에 클래스형이 온 경우 카2 타입의 주소 저장
		// 넘겨받은 주소 뒤에 있는
	}

	@Override
	public String toString() {
		return this.color + "--" + this.gearType + "--" + this.door;
	}
}

public class Ex08 {

	public static void main(String[] args) {
		Car2 c1 = new Car2();
		// c1 주소지에는 white;auto;4가 들어있음
		System.out.println(c1);

			//생성자를 사용하여 객체 복사.
		Car2 c2 = new Car2(c1);
		System.out.println(c2);
	}

}
