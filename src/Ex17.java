import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Ex17 {

public static void main(String[] args) {
	Set set = new HashSet();
	
	for (int i = 0; set.size()<6; i++) {
		int number = (int) (Math.random() * 45) +1;
		set.add(number);
	}
	System.out.println(set);

List list = new LinkedList(set);
Collections.sort(list);
System.out.println(list);


}//main
}//class
