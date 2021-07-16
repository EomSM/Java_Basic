import java.util.Stack;

public class Ex09 {

	public static Stack back = new Stack();
	public static Stack forward = new Stack();

	public static void main(String[] args) {
		moveURL("1 - nate");
		moveURL("2 - naver");
		moveURL("3 - tjoeun");
		moveURL("4 - google");
		moveURL("5 - youtube");
		
		moveBack();
		printStatus();
		moveBack();
		printStatus();
		moveBack();
		printStatus();
		
		moveURL("java");
		printStatus();
		
		moveBack();
		printStatus();
		
		moveBack();
		printStatus();
		
		
		
	}// main

	public static void printStatus() {
		System.out.println("back       : " + back);
		System.out.println("forward    : " + forward);
		System.out.println("현재화면   : " + back.peek());
		System.out.println("===============================");

	}// printStatus

	public static void moveURL(String url) {
		back.push(url); // 현재화면
		if (!forward.empty()) {
			forward.clear();
		}
	}// moveURL

	public static void moveForward() {
		System.out.println("앞으로 가기");
		if (!forward.empty()) {
			back.push(forward.pop());
		}
	}// moveForward

	public static void moveBack() {
		System.out.println("뒤로 가기");
		if (!back.empty()) {
			forward.push(back.pop());
		}
	}//moveBack

}// class