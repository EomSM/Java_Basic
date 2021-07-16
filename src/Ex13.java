import java.util.ArrayList;
import java.util.Iterator;

public class Ex13 {
	public static void main(String[] args) {

		ArrayList<String> original = new ArrayList<>(10);
		ArrayList<String> copy1 = new ArrayList<>(10);
		ArrayList<String> copy2 = new ArrayList<>(10);

		for (int i = 0; i < 10; i++) {
			original.add(i + " ");
		}
		Iterator<String> iter = original.iterator();

		//복사 : original -> copy1
		while (iter.hasNext()) {
			copy1.add(iter.next());
		}
		System.out.println("복사 : original -> copy1");
		System.out.println("original  : " + original);
		System.out.println("copy1     : " + copy1);
		System.out.println("----------------------------------");

		
		
		iter = original.iterator();
		//이동 : original -> copy2 : 원본 내용 제거하고.
		while (iter.hasNext()) {
			copy2.add(iter.next());
			iter.remove();
		}
		System.out.println("이동 : original -> copy2");
		System.out.println("original  : " + original);
		System.out.println("copy2     : " + copy2);
		System.out.println("----------------------------------");

		
		
	}// main
}// class
