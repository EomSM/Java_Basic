package p2;

import p1.Pac2Src1;

public class Pac4 {
	public static void main(String[] args) {
		Pac2Src1 p2s1 = new Pac2Src1();
		p2s1.num1 = 11;// public
		//p2s1.num2 = 22; <-private
		// p2s1.num3 = 33; <-default
		// p2s1.num4 = 44; //<-protected
	}
}
