package day07;

/*
상속
Parent  child
super 	sub

수직관계

자바에서 
	부모 클래스는 하나만 허용.
	자식 클래스는 여러개도 가능
 
클래스 = 타입 = 권한

*/

//2차원 좌표
class Point {
	int x, y;

	public Point() {
		System.out.println("부모 클래스의 기본 생성자");

	}

}

//3차원 좌표
class Point3D_1 extends Point {
	int z_1;

	public Point3D_1() {
		// super();
		System.out.println("자식 클래스(3D_1)의 기본 생성자");
	}

}

class Point3D_2 extends Point {
	int z_2;

	public Point3D_2() {
		// super();
		System.out.println("자식 클래스(3D_2)의 기본 생성자");
	}

}

//4차원 좌표
class Point4D extends Point3D_1 {
	int t;

	public Point4D() {
		System.out.println("자녀(3D_1)의 자식 클래스의 기본 생성자");

	}
}

public class Ex14 {

	public static void main(String[] args) {
		// new Point3D();
		Point3D_1 p3_1 = new Point3D_1();
		p3_1.x = 11;
		p3_1.y = 22;
		p3_1.z_1 = 33;

		System.out.println(p3_1.x + " -- " + p3_1.y + " -- " + p3_1.z_1);

		
		Point p1 = new Point();
		p1.x = 123;
		p1.y = 456;

		System.out.println(p1.x + " == " + p1.y);

		Point p2 = (Point)p3_1;
		p2.x=300;
		p2.y=400;
//		p2.z_1 =; //불가능
		
		
		//instanceof 연산자.
		//사용법 : 참조변수 instanceof 클래스이름
		
		System.out.print(p3_1 instanceof Point3D_1);
		System.out.println(p1 instanceof Point);
		System.out.print(p1 instanceof Point3D_1);
		System.out.print(p2 instanceof Point3D_1);
		
		
		if(p1 instanceof Point3D_1) {
  		p3_1 = (Point3D_1)p1;
  	}
		
		p3_1=(Point3D_1) p1;
		//부모타입의 변수에 할당하면 컴파일러 수준에서 오류는 나타나지 않음
		//Exception in thread "main" java.lang.ClassCastException: class day07.Point cannot be cast to class day07.Point3D_1 (day07.Point and day07.Point3D_1 are in unnamed module of loader 'app')
		//런타임에서는 오류 상단처럼 나옴. 
		
		
		Point3D_1 p3_2 = (Point3D_1)p2; //같은 타입의 주소를 할당
		p3_2.x=333;
		p3_2.y=555;
		p3_2.z_1=111;
		System.out.println(p3_2.x + " -- " + p3_2.y + " -- " + p3_2.z_1);

		
		//권한이 작은 곳에서
//		큰쪽으로 줄 때에는 표시를 해줘야 함
		//할당연산자 우측=> 좌측으로
		
		//권한이 작은타입> 권한이 큰타입으로 형변환할 때엔 표시 없어도 ok
		//상속관계에 한해서 참조형변수의 형변환 가능
	}

}
