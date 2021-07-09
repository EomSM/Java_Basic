package day06;

class Card {
	String kind;
	int number;
	static int width = 100;
	static int height = 250;

}

public class Ex06 {

	public static void main(String[] args) {

		System.out.printf("너비 : %d%n", Card.width);
		System.out.printf("높이 : %d%n", Card.height);

		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 5;

		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 7;

		System.out.printf("c1 : %s -%d -%d -%d%n", 
				c1.kind, c1.number, Card.width, Card.height);
		System.out.printf("c2 : %s -%d -%d -%d%n",
				c2.kind, c2.number, Card.width, Card.height);

		c1.kind = "clover";
		c1.number = 5;

		System.out.printf("c1 : %s--%d--%d--%d%n",
				c1.kind, c1.number, Card.width, Card.height);
		System.out.printf("c2 : %s--%d--%d--%d%n",
				c2.kind, c2.number, Card.width, Card.height);

		c1.width = 90;
		c1.height = 200;

		System.out.printf("c1 : %s--%d--%d--%d%n",
				c1.kind, c1.number, Card.width, Card.height);
		System.out.printf("c2 : %s--%d--%d--%d%n",
				c2.kind, c2.number, Card.width, Card.height);

	}

}
