package day08;

abstract class MouseEvents {
	public abstract void LButtonClick();

	public abstract void RButtonClick();

	public abstract void CButtonClick();

	public abstract void buttonClick();

}

class MouseEventsAdapter extends MouseEvents {
	public void LButtonClick() {
	}

	public void RButtonClick() {
	}

	public void CButtonClick() {
	}

	public void buttonClick() {
	}

}

class MyLButton extends MouseEventsAdapter {
	public void LButtonClick() {
		System.out.println("left button clicked");

	}
}

class MyRButton extends MouseEventsAdapter {
	public void RButtonClick() {
		System.out.println("right button clicked");
	}
}

class MyCButton extends MouseEventsAdapter {
	public void CButtonClick() {
		System.out.println("center button clicked");
	}

}

public class Ex13 {
	public void main(String[] args) {
		MouseEvents left = new MyLButton();
		MouseEvents right = new MyRButton();
		MouseEvents center = new MyCButton();

		left.LButtonClick();
		right.RButtonClick();
		center.CButtonClick();

		System.out.println("----------------------------------------");

		MouseEvents[] me = new MouseEvents[5];
		me[0] = new MyLButton();
		me[1]	= new MyCButton();
		me[2] = new MyCButton();
		me[3]	= new MyRButton();
		me[4] = new MyLButton();			
				
	for (int i = 0; i < me.length; i++) {
		me[i].buttonClick();
		
	}//for
				
	}// main

}// class