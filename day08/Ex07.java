package day08;

class Car {

	String color;
	int door;

	public void drvie() {
		System.out.println("drive");
	}

	public void stop() {
		System.out.println("stop");
	}
} // car

class FireEngine extends Car {
	public void water() {
		System.out.println("water");
	}
}

class Ambulance extends Car {
	public void siren() {
		System.out.println("siren");
	}

}

public class Ex07 {
	public static void main(String[] args) {
		FireEngine fire = new FireEngine();
		Ambulance abl = new Ambulance();
		Car car = null;

		car = fire;
		fire = (FireEngine) car;

		car = abl;
		abl = (Ambulance) car;
		

		FireEngine fe1 = new FireEngine();
		FireEngine fe2 = null;
		fe1.water();
		car = fe1;
		fe2 = (FireEngine) car;
		fe2.water();
		System.out.println("--------------------");

		FireEngine fe3 = new FireEngine();
		System.out.println(fe3 instanceof FireEngine);
		System.out.println(fe3 instanceof Car);
		System.out.println(fe3 instanceof Object);

		System.out.println("--------------------");

		Car car2 = new Car();
		FireEngine fireEngine = new FireEngine();
		Ambulance ambulance = new Ambulance();
		method1(car);
		method1(car2);
		method1(fireEngine);
		method1(ambulance);
		
	}

	// 매개변수의 타입이 오브젝트 타입을 선언산다는 것은 어떤 객체의 주소도전달할 수 있다는 것.
	public static void method1(Object obj) {
		if (obj instanceof FireEngine) {
			FireEngine fe = (FireEngine) obj;
			fe.water();
		} else if (obj instanceof Ambulance) {
			Ambulance abl = (Ambulance) obj;
			abl.siren();
		} else if (obj instanceof Car) {
			Car car = (Car)obj;
			car.drvie();
			
		}
		}
	}


