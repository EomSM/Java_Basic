package day05;

class Car{
	String color;
	String gearType;
	int door;
	int displacement;

public void display() {
	System.out.printf("color: %s, gearType: %s, door: %d, displacement: %d", color, gearType, door, displacement);
	System.out.println("\n-----------------------------------");
}




}

public class Ex10 {


	public static void main(String[] args) {
		Car car1 = new Car();
		car1.color="blue";
		car1.gearType="auto";
		car1.door=2;
		car1.displacement=3000;
		car1.display();
		
		Car car2 = new Car();
		car2.color="red";
		car2.gearType="manual";
		car2.door=4;
		car2.displacement=5000;
		car2.display();
	
		car2=car1;
		
		
	}

}
