package day07;

public class Ex07_1 {

	public static void main(String[] args) {
		Calc c1=new Calc(11,22);
		Calc c2=new Calc(33,55);
		
		c1.add();
		c2.add();
		
	}

}

class Calc {
	int num1, num2;
	int result;

	public Calc() {
	}

	public Calc(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public int add() {
		result = num1 + num2;
		return result;
	}

	public int subtract() {
		result = num1 - num2;
		return result;
	}
}
