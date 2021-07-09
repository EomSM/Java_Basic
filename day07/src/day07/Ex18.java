package day07;

class Shape {
	String color = "green";

	public void draw() {
		System.out.println("도형을 그리다");
	}

}// shape

class Point3 {
	int x, y;

	public Point3() {
		this(0, 0);
	}

	public Point3(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}

class Circle2 extends Shape {
	Point3 center; // 클래스타입의 주소
	int radius;

	public Circle2() {
		this(new Point3(20, 20), 100);
	}

	public Circle2(Point3 center, int radius) {
		this.center = center;
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Point3 center: " + center + ", radius: " + radius + ", color: " + this.color;

	}

}

class Triangle extends Shape {
	Point3[] p;

	public Triangle() {
	}

	public Triangle(Point3[] p) {

		this.p = p;
	}// 포인트 객체 배열 생성후 받기

	public Triangle(Point3 p1, Point3 p2, Point3 p3) {
		this.p = new Point3[] { p1, p2, p3 };
	}// 좌표값 받아서 여기에서 배열 생성.

	@Override
	public String toString() {
		return p[0] + " -- " + p[1] + " -- " + p[2];
	}

}

public class Ex18 {

	public static void main(String[] args) {
		Circle2 circle = new Circle2();
		System.out.println(circle);

		Point3[] p = { new Point3(10, 10), 
				new Point3(20, 20), new Point3(30, 30)};
		Triangle t1 = new Triangle();
		System.out.println(t1);
		// Cannot load from object array because "this.p" is null
		Triangle t2 = new Triangle(new Point3(111, 111), new Point3(222, 222), new Point3(333, 333));
		System.out.println(t2);

	}

}
