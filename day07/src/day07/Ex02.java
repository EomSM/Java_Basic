
package day07;

public class Ex02 {

	public static void main(String[] args) {

	}

}

class MultiplicationTable {
	public MultiplicationTable() {
		display();
		System.out.println("--------------");
	}

	public MultiplicationTable(int dan) {
		//this( );
		display(dan);
		System.out.println("----------------");
	}

	// 구구단 전체 출력
	public void display() {
		for (int i = 2; i < 9; i++) {
			for (int j = 1; j < 9; j++) {
				System.out.printf("%d * %d = %d%n", i, j, i * j);

			}
			System.out.println();
		}
	new	MultiplicationTable();
	//display( 5 );
	}

	public void display(int dan) {
		System.out.printf("---%d단 ----%n", dan);
		for (int i = 0; i < 9; i++) {
			System.out.printf("%d*%d=%d%n", dan, i, dan * i);
		}
	}

}
