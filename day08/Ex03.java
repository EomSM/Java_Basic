package day08;

class ParentB {
	public ParentB() {
		//this();
		System.out.println("ParentB()");
	}

	public ParentB(int i) {
		this();
		System.out.println("ParentB(int i)");
	}

	public ParentB(float f) {
		this();
		System.out.println("ParentB(float f)");
	}

}//Parents

	class ChildB extends ParentB {

		public ChildB() {
			System.out.println("ChildB()");
		}

		public ChildB(int i) {
			this();
			System.out.println("ChildB(int i)");
		}
		public ChildB(float f){
			this(55);
			System.out.println("ChildB(float f)");
		}
	}


public class Ex03 {
public static void main(String[] args) {
	System.out.println("프로그램 시작");
	new ChildB(8.15F);
	
	System.out.println("프로그램 종료");
	

}//main



}//Ex03