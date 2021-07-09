package day07;

class Point2 {
	int x, y;

	public Point2() {
		this(50, 50);
	}

	public Point2(int x, int y) {
		this.x = x;
		this.y = y;

	}

	@Override
	public String toString() {
		return x + "--" + y;

	}

}

class Point3D2 extends Point2 {
	int z;

	@Override
	public String toString() {
		return super.toString() + "--" + z;

	}

}

class Circle {
	Point2 p; // 포함관계
	int radius;// 반지름

	public Circle() {
		p = new Point2();
		radius = 20;
	}

	@Override
	public String toString() {
		return this.p + "--" + this.radius;
	}
}

public class Ex17 {

	public static void main(String[] args) {
	Circle c=	new Circle();
	System.out.println(c);
	
	
	c.p.x = 30;
	c.p.y=30;
	c.radius=60;
	System.out.println(c);

	}

}
