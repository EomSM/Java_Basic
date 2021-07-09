package day05;

class Data2 {	int x;	}	

public class Ex18 {

	public static void main(String[] args) {
		Data2 d = new Data2();
		System.out.println("----change (int x) 호출 전 -----");
		System.out.printf("d.x : %d%n", d.x);

		change(d);

		System.out.println("----change (int x) 호출 후 -----");
		System.out.printf("d.x : %d%n", d.x);

	}

	public static void change(Data2 d) {
		d.x = 3333;
	}

}
//DATA2 클래스 타입의 변수 를 지정 > 주소가 필요. 
//주소를 받아서 호출: 값의 변경.

//실제 값이 전달되면 by value 주소값이 전달되면 by reference