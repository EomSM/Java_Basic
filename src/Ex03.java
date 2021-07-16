import java.util.ArrayList;
import java.util.List;

public class Ex03 {
	public static void main(String[] args) {
		String source = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		final int LIMIT = 10;
		int length = source.length();
		// source 문자열을 한줄에
		// limit수 만큼만 출력
		// source%10 ==0;
		// length /Limit 행
		// source%10 !=0;
		// length /Limit + 1행
		List list = new ArrayList<String>(length / LIMIT + 10);

		for (int i = 0; i < length; i++) {
			if (i + LIMIT < length) {
				list.add(source.substring(i, i + LIMIT));
			} else {
			}
			//System.out.println(list);
			//System.out.println(list.size());

			
			for (int j = 0; j < list.size(); j++) {
				System.out.println(list.get(j));
			}
		}

	}

}
