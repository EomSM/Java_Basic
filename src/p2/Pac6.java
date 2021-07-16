package p2;

import p1.Pac2Src1;


//protected의 경우 부모t타입의 참조변수로는 접근 못하지만
//자식타입의 참조변수로는 접근 가능함.
public class Pac6 extends Pac2Src1 {

	public static void main(String[] args) {

		Pac2Src1 src = new Pac2Src1();
		src.num1 = 11;
//		src.num2 = 22;
		// src.num3 = 33;
		// src.num4 = 44;
		src = new Pac6();
		src.num1 = 11;
//src.num2 = 22;
//src.num3 = 33;
//src.num4 = 44;

		Pac6 p6 = new Pac6();
		p6.num1 = 11;
//	p6.num2 = 22;
//	p6.num3 = 33;
		p6.num4 = 44;
	}
}