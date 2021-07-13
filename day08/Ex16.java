package day08;

interface Inter03 {
	public abstract void displayInter03();
}

interface Inter04 {
	public abstract void displayInter04();
}

interface Inter05 {
	public abstract void displayInter05();
}

//인터페이스를 다중상속 받는 인터페이스
interface ChildInter04 extends Inter03, Inter04, Inter05 {

}

//인터페이스르 다중상속받는 클래스
class ChildInter05 implements Inter03, Inter04, Inter01, Inter05 {
	public void displayInter03() {
		System.out.println("displayInter03() overriding");
	}

	public void displayInter04() {
		System.out.println("displayInter04() overriding");

	}

	public void displayInter05() {
		System.out.println("displayInter05() overriding");

	}

	@Override
	public void display1() {
		// TODO Auto-generated method stub

	}

	@Override
	public void display2() {
		// TODO Auto-generated method stub

	}

	@Override
	public void display3() {
		// TODO Auto-generated method stub

	}

	@Override
	public void display4() {
		// TODO Auto-generated method stub

	}

}

public class Ex16 {

	public static void main(String[] args) {
		Inter03 i3 = new ChildInter05();
		Inter04 i4 = new ChildInter05();
		Inter05 i5 = new ChildInter05();
		ChildInter05 chi5 = new ChildInter05();

		i3.displayInter03();
//		i3.displayInter04();
//		i3.displayInter05();

		i4.displayInter04();

		i5.displayInter05();

		chi5.displayInter03();
		chi5.displayInter04();
		chi5.displayInter05();
	}

}// Ex16
