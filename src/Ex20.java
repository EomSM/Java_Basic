import java.util.HashSet;
import java.util.Iterator;

public class Ex20 {
	public static void main(String[] args) {
		HashSet setA = new HashSet();
		HashSet setB = new HashSet();
		HashSet setHab = new HashSet();// 합집합
		HashSet setKyo = new HashSet();// 교집합
		HashSet setCha = new HashSet();// 차집합


		setA.add("1");
		setA.add("2");
		setA.add("3");
		setA.add("4");

		setB.add("3");
		setB.add("4");
		setB.add("5");
		setB.add("6");

		System.out.println("setA : " + setA);
		System.out.println("setB : " + setB);
		System.out.println("======================================");

		Iterator iterB = setB.iterator();
		while (iterB.hasNext()) {
			Object tmp = iterB.next();
			if (setA.contains(tmp)) {
				setKyo.add(tmp);
			}
		} // while

		System.out.println("교집합(A∩B) : " + setKyo);

		// 차집합 A-B

		Iterator iterA = setA.iterator();
		while (iterA.hasNext()) {
			Object tmp = iterA.next();
			if (!setB.contains(tmp)) {
				setCha.add(tmp);
			}
		} // while
		System.out.println("차집합(A-B) : " + setCha);

		setCha.clear();//내용 비우기
		
		// 차집합 B-A

		iterB = setB.iterator();
		while (iterB.hasNext()) {
			Object tmp = iterB.next();
			if (!setA.contains(tmp)) {
				setCha.add(tmp);
			}
		} // while
		System.out.println("차집합(B-A) : " + setCha);

		// 합집합 A∪B
		iterA = setA.iterator();
		iterB = setB.iterator();
		
		while (iterA.hasNext()) {
			Object a = iterA.next();
			setHab.add(a);
			
		} 
		while (iterB.hasNext()) {
			Object b = iterB.next();
			setHab.add(b);
			
		}
		System.out.println("합집합(A∪B) : " + setHab);

	}// main
}// class
