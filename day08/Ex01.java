package day08;

class ParentA {
}

class ChildA1 extends ParentA {
}

class ChildA2 extends ParentA {
}

class ChildA3 extends ParentA {
}

class ChildA4 extends ParentA {
}

class ChildA5 extends ParentA {
}

public class Ex01 {
	public static void main(String[] args) {
		ParentA p1 = new ParentA();
		ChildA1 c1 = new ChildA1();
		ChildA2 c2 = new ChildA2();
		ChildA3 c3 = new ChildA3();
		ChildA4 c4 = new ChildA4();
		ChildA5 c5 = new ChildA5();

		instanceofTest(p1); // PA
		instanceofTest(c1); // CA1
		instanceofTest(c2); // CA2
		instanceofTest(c3); // CA3
		instanceofTest(c4); // CA4
		instanceofTest(c5); // CA5

	}

	public static void instanceofTest(ParentA p) {
		if (p instanceof ChildA1) {
			System.out.println("CA1");
		} else if (p instanceof ChildA2) {
			System.out.println("CA2");
		} else if (p instanceof ChildA3) {
			System.out.println("CA3");
		} else if (p instanceof ChildA4) {
			System.out.println("CA4");
		} else if (p instanceof ChildA5) {
			System.out.println("CA5");
		} else if (p instanceof ParentA) {
			System.out.println("PA");
		}

	} //instanceofTest
}//Ex01
