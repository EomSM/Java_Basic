import java.util.LinkedList;

public class Ex06 {
	public static void main(String[] args) {
		// stack = first in last out
		LinkedList<Integer> stack = new LinkedList<>();
		stack.addLast(new Integer(12));
		stack.addLast(56);
		stack.addLast(7);
		stack.addLast(24);
		System.out.println("stack : " + stack);
		System.out.println("---------------------------------------");

		int number ;
		while (!stack.isEmpty()) {
			stack.removeLast();
			number = stack.getLast();
			System.out.println("number : " + number);
			System.out.println("stack : " + stack);
			System.out.println("---------------------------------------");
		}

		
//		System.out.println("stack : " + stack);
//		System.out.println("---------------------------------------");

	}
}
