import java.util.LinkedList;

//Queue : First in First out
public class Ex07 {

	public static void main(String[] args) {
		LinkedList<String> queue = new LinkedList<String>();
		queue.offer("java");
		queue.offer("kotlin");
		queue.offer("swift");
		queue.offer("android");
		System.out.println(queue);
		System.out.println("-----------------------------");

		String language = queue.peek();
		System.out.println("language : " + language);
		System.out.println(queue);
		System.out.println("------------------------------");

		while (!queue.isEmpty()) {
			language = queue.poll();
			System.out.println("language : " + language);
			System.out.println(queue);
			System.out.println("------------------------------");
		}

	}
}
