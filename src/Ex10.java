import java.util.EmptyStackException;
import java.util.Stack;

public class Ex10 {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("입력하는 방법 : ((12 +( 3*4)+3))");
			System.out.println("입력하는 방법에 나온대로");

			System.out.println("프로그램을 종료합니다");
			System.exit(0);
		}
		Stack<String> st = new Stack<>();
		String expression = args[0];

		System.out.println("수식 : " + expression);

		try {
			for (int i = 0; i < expression.length(); i++) {
				char ch = expression.charAt(i);
				if (ch == '(') {
					st.push(ch + "");
				} else if (ch == ')') {
					st.pop();
				}
			}

			if (st.isEmpty()) {
				System.out.println("괄호가 일치");
			} else {
				System.out.println("괄호 부족");
			}
		} catch (EmptyStackException e) {
						//stack에 data가 없을 때 pop()하려는 경우 발생하는 오류
			System.out.println("괄호 초과");
		}
	}
}
