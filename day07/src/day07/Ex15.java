package day07;
class Car3{
	String color;
	int door;
	int displacement;
	public Car3() { }
	public Car3(int door) { }
}
class Vehicle{
	int wheel;
	int chair;
}

// Sonata
// 상속관계 : is a 관계  - Car3  
// 포함관계 : has a 관계 - Vehicle

class Sonata extends Car3{
	String gearType;
	Vehicle vc;
	public Sonata() {
		
	}
}
public class Ex15 {
  public static void main(String args[]) {
  	Car3 c1 = new Car3();
  	c1.color = "red";
  	c1.door = 4;
  	c1.displacement = 3000;
  	// c1.gearType = "auto";
  	
  	Sonata snt = new Sonata();
  	snt.color = "blue";
  	snt.door = 2;
  	snt.displacement = 4000;
  	snt.gearType = "manual";
  	snt.vc = new Vehicle();
  	
  	
  }
}