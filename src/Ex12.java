import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Ex12 {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < 5; i++) {
			list.add((i + 1) + "");

		}
		System.out.println(list);

		System.out.println("--------------------------");

		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			String number = iter.next();
			System.out.print(number + " ");
		}
		System.out.println("\n --------------------------");

		ListIterator listIter = list.listIterator();
		while (listIter.hasNext()) {
			System.out.print(listIter.next() + " ");
		}
		System.out.println("\n --------------------------");

		while (listIter.hasPrevious()) {
			System.out.print(listIter.previous() + " ");
		}
		System.out.println("\n --------------------------");

		for (String num : list) {
			System.out.print(num + " ");

		}
		System.out.println("\n --------------------------");
	}
}
