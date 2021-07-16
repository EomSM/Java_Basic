import java.util.ArrayList;

/*
Collection
List - ArrayList, LinkedList : index(O) = 데이터 중복 허용
Map  - HashMap : key - value : : index(X) = key의 중복 불가 /value는 허용
Set - HashSet : : index(X) = 데이터의 중복 허용 X


ArrayList
*/

public class Ex02 {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		// Generic : String - String만 저장 기ㅏ능. Integer면 Int만 등등...
		// 객체 10개 저장
		list.add("스위프트"); // 객체 추가
		list.add("코틀린");
		list.add("스위프트"); // 객체 추가
		list.add("오라클");

		String str1 = list.get(0);
		System.out.println(str1);

		int sizeOfList = list.size();
		System.out.println("sizeOfList : " + sizeOfList);

		System.out.println("------------------------------------");

		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%s ", list.get(i));
			System.out.println("------------------------------------");
		}
		;

		System.out.println();

		// advanced for loop
		for (String str : list) {
			System.out.printf("%s", str);
		}
		System.out.println("------------------------------------");

		System.out.println(list);

		list.add("SPRING");

		System.out.println(list);

		System.out.println("------------------------------------");
		list.add(1, "JSON");
		System.out.println(list);

		list.add(0, "Java Script");
		System.out.println(list);
		System.out.println("------------------------------------");

		list.add(0, "JSP");

		System.out.println(list);

		list.set(3, "python"); // e데이터의 변경
		System.out.println(list);
		System.out.println("------------------------------------");

		list.remove("python");
		System.out.println(list);
		System.out.println("------------------------------------");

		list.remove("JSP");
		System.out.println(list);
		System.out.println("------------------------------------");

		int idx1 = list.indexOf("SPRING");
		System.out.println(list);
		System.out.println("------------------------------------");

		int idx2 = list.indexOf("스위프트");
		int idx3 = list.lastIndexOf("스위프트");
		System.out.printf("idx2(indexof) : %s%n",  idx2);
		System.out.printf("idx3(lastindexof): %s%n", idx3);
		
		
	}// main
}// class
