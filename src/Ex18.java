import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/*HashSet :순서 고정 x
 LinkedHashSet : 순서가 저장됨
 HashSet과 같은 구조로 데이터의 중복을 허용하지 않음.
*/

public class Ex18 {
	public static void main(String[] args) {

		Set set = new LinkedHashSet();
		int[][] board = new int[5][5];
		for (int i = 0; set.size() < 25; i++) {
			set.add((int) (Math.random() * 50) + 1 + "");

		}

		System.out.println(set);
		System.out.println("-------------------------------------");

		Iterator<String> iter = set.iterator();
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = Integer.parseInt(iter.next());
				System.out.printf("2%d ", board[i][j]);
			}
			System.out.println();
		}

	}// main

}// class
