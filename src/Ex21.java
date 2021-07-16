import java.util.Set;
import java.util.TreeSet;

//TreeSet(BinaryTree)
public class Ex21 {
	public static void main(String[] args) {
		Set set = new TreeSet();
		for (int i = 0; set.size() < 6; i++) {
			int num = (int) (Math.random() * 45) + 1;
			set.add(num);
		}
		System.out.println(set);

		set.clear();

		int[] score = { 80, 95, 50, 35, 45, 65, 10, 100 };
		for (int i = 0; i < score.length; i++) {
			set.add(score[i]);
		}

		System.out.println(set);
		// 50보다 작은 값
		System.out.println(((TreeSet) set).headSet(50));
		//50보다 큰 값= 50 이상 
		System.out.println(((TreeSet) set).tailSet(50));

	}// main

}//class
