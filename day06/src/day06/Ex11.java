package day06;
//재확인?

public class Ex11 {
	public static void main(String args[]) {
		String[] arrStr = new String[] { "100", "200", "300" };

		// 100200300
		System.out.println(concatenate("", "100", "200", "300"));
		// 100-200-300-
		System.out.println(concatenate("-", arrStr));

		System.out.println(concatenate("~", new String[] { "1", "2", "3" }));

		String[] strs = new String[2];
		strs[0] = "hello";
		strs[1] = "java";

		String[] strs2 = new String[0];
	//	strs2[0] = "hello";

		System.out.println("[" + concatenate("~", new String[0]) + "]");

	}

//가변인자
	public static String concatenate(String delim, String... args) {
		String result = "";
		for (String str : args) {
			result += str + delim;
		}
		return result;
	}
}
