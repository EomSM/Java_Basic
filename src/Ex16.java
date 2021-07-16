import java.security.PublicKey;
import java.util.Arrays;
import java.util.Comparator;

public class Ex16 {
	public static void main(String[] args) {
		String[] animals = { "cat", "dog", "lion", "liom ", "tiger" };

		System.out.println("animals : " + Arrays.toString(animals));
		System.out.println("----------------------------------------");

		Arrays.sort(animals, String.CASE_INSENSITIVE_ORDER);
		System.out.println("animals : " + Arrays.toString(animals));
		System.out.println("----------------------------------------");

	}// main
}// class

class DecendingCompare2 implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		if (o2 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable) o1;
			Comparable c2 = (Comparable) o2;
			return c2.compareTo(c1);
		}
		return -1;
	}//compare

}// class
