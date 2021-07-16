import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//hashset

public class Ex15 {
	public static void main(String[] args) {

		Object[] arrObj = { "1", new Integer(1), "2", "2", "3", "3", "3" };
		System.out.println(Arrays.toString(arrObj));
		System.out.println("---------------------------------------------");

		Set set = new HashSet();
		for (int i = 0; i < arrObj.length; i++) {
			set.add(arrObj[i]);
		}
		System.out.println(set);
	}
}
