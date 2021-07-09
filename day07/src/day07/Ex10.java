package day07;

public class Ex10 {
	static int a = 11;
	static int[] arrNums = new int[10];
//static 초기화 블럭이 메인메소드보다 먼저 실행됨
	static {
		for (int i = 0; i < arrNums.length; i++) {
			arrNums[i] = (int) (Math.random() * 10) + 1;

		}
	}

	public static void main(String[] args) {
		System.out.printf("%d%n ", Ex10.a);
		System.out.println("\n------------------------");

		for (int i = 0; i < arrNums.length; i++) {
			System.out.printf("%d ", arrNums[i]);
		}
		System.out.println("\n------------------------");
	}

}
