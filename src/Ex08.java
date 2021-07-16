import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//stack
public class Ex08 {
	public static void main(String[] args) {

		Stack<String> st = new Stack();

		st.push("0");
		st.push("1");
		st.push("2");

		System.out.println(st.peek());

		System.out.println("--------------stack ----------");
		while (!st.isEmpty()) {
			System.out.print(st.pop() + " ");
		}
		System.out.println("\n----------------------");

		Queue<String> queue = new LinkedList<>();
		queue.offer("0");
		queue.offer("1");

		queue.offer("2");

		System.out.println(queue.peek());
		System.out.println("---------------queue --------");
		while (!queue.isEmpty()) {
			System.out.print(queue.poll() + " ");
		}
		System.out.println("\n----------------------");

	}// main
}// class
