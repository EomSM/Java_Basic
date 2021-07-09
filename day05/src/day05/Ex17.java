package day05;

class Data {
	int x;
}

public class Ex17 {

	public static void main(String[] args) {
		Data d = new Data();
		System.out.println("----change (int x) 호출 전 -----");
		System.out.printf("d.x : %d%n", d.x);

		change(111);

		System.out.println("----change (int x) 호출 후 -----");
		System.out.printf("d.x : %d%n", d.x);

	}

	public static void change(int x) {
		x = 3333;
	}

}
//현재 상황에서는 변화 없음 
