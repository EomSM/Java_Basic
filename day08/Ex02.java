package day08;

class Point {
	int x, y;

	public Point() {
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;

	}

	public String getLocation() {
		return "x: " + this.x + ", y: " + this.y;
	}
}

class Point3D extends Point {
	int z;

	public Point3D() {
		super();
	}

	public Point3D(int z) {
		// 자식 클래스의 생성자 첫줄에 부모 생성자를 호출하는 코드를 작성하지 않으면 자동으로 부모의 기본 생성자를 호출.
		// 부모의 매개변수 있는 생성자를 호출하려면 명시적으로 코딩해줘야 함.

		this.z = z;
	}

	public Point3D(int x, int y, int z) {
		super(x, y);
		this.x = x;
		this.y = y;
		this.z = z;
	}

	@Override
	public String getLocation() {
		return "x: " + this.x + ", y: " + this.y + ", z: " + this.z;
	}
}// 3d

public class Ex02 {

	public static void main(String args[]) {
		Point p1 = new Point();
		String result1 = p1.getLocation();
		System.out.println("result1 [" + result1 + "]");

		Point3D p3d1 = new Point3D();
		String result2 = p3d1.getLocation();
		System.out.println("result2 [" + result2 + "]");

		Point p2 = new Point(12, 24);
		String result1_2 = p2.getLocation();
		System.out.println("result1_2 [" + result1_2 + "]");

		Point3D p3d2 = new Point3D(12, 24, 32);
		String result2_1 = p3d2.getLocation();

		System.out.println("result2_1 [" + result2_1 + "]");

		Point3D p3= new Point3D(55);
		System.out.println("result2_1 [" + p3.getLocation() + "]");

		
	}

}
