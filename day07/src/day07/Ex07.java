package day07;

class Car{
	String color;
	String gearType;
	int door;
	
	public Car() {
		this("white", "auto", 4);
		
		//this: 객체가 생성되었을 때에 위치를 저장하는 참조변수
		// 이걸 사용하는 이유 : 가독성
	}
	public Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	@Override
	public String toString() {
		return this.color + "--" + this.gearType + "--" + this.door;
	}
}

public class Ex07 {
  public static void main(String args[]) {
  	Car c1 = new Car();
  	System.out.println(c1);
  	c1.color="skyblue";
  	c1.gearType="manual";
  	c1.door=3;
  	System.out.println(c1);

  	
  	Car c2 = new Car();
  	System.out.println(c2);
  	
  	Car c3 = new Car("blue", "manual", 2);
  	System.out.println(c3);
  	
  	Car c4 = new Car("red", "auto", 4);
  	System.out.println(c4);
  }
}




