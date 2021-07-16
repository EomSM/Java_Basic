import java.util.HashMap;
import java.util.Scanner;

public class Ex24 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myID", "1111");
		map.put("tjoeun", "2222");
		map.put("tjoeun", "3333"); // 3333으로 밸류값 변경됨

		String pswd = (String) map.get("tjoeun");
		System.out.println(pswd);

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("id, pw  입력하세요");
			System.out.println("id : ");
			String id = sc.nextLine().trim();
			System.out.println("pw : ");
			String pw = sc.nextLine().trim();

			System.out.println("id : " + id + " / pw : " + pw);

			if (!map.containsKey(id)) {
				System.out.println("해당하는 id 없음");
				continue;
			} else {
				if (!map.get(id).equals(pw)) {
					System.out.println("pw를 다시 입력해주세요.");
				} else {
					System.out.println("id, pw 일치함");
					System.out.println("프로그램 종료");
					break;
				}
			} // else

		} // if

	}// main
}// class
