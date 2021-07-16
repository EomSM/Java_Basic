import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex11 {
	public static Queue<String> queue = new LinkedList<>();
	public static final int MAX_SIZE = 5;

	public static void main(String[] args) {
		System.out.println("help = 도움말");
		while (true) {
			System.out.println("> ");
			try {
				Scanner sc = new Scanner(System.in);
				String input = sc.nextLine().trim();
				if (input.equalsIgnoreCase("q")) {
					System.out.println("프로그램 종료");
					System.exit(0); // 재귀적 종료
				} else if (input.equalsIgnoreCase("help")) {
					System.out.println("도움말");
					System.out.println("q 또는 Q 입력시 프로그램 종료");
					System.out.println("history = 최근 입력 명령어 " + MAX_SIZE + "개 출력");

				} else if (input.equals("history")) {
					int i = 0;
					save(input);

					LinkedList list = (LinkedList) queue;
					Iterator iter = list.iterator();
					// 순회 하는 객체 : 데이터 있는 경우에만 프린트.

					while (iter.hasNext()) {
						System.out.println(++i + ")" + iter.next());
					}
				} else {
					save(input);
					System.out.println(input);
				}
				
			} catch (Exception e) {

			} // catch

		} // while

	}// main

	public static void save(String input) {
		if (!input.equals("")) {
			queue.offer(input);
		} else if (queue.size() > MAX_SIZE) {
			queue.remove();
		}
	}// save

}// class
