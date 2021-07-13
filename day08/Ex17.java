package day08;

interface Inter06 {
	public abstract void displayParent06();
}

abstract class Parent06 {
	public abstract void displayParent06();

}

class Child06 extends Parent06 implements Inter06 {
	public void displayInter06() {
		System.out.println("displayInter06 in Child606");
	}

	@Override
	public void displayParent06() {
		System.out.println("displayInter06 in Child06");
	}

public static class Ex17 {
public static void main(String[] args) {
	Child06 ch06=new Child06();
	Inter06 i06= new Child06();
	Parent06 p06=new Child06();
	
	ch06.displayParent06();
	ch06.displayInter06();
	
	i06.displayParent06();
	
	p06.displayParent06();
}//main
}//class
}