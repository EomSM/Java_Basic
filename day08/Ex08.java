package day08;

class Product {
	int price;
	int bonusPoint;

	public Product() {
	}

	public Product(int price) {
		this.price = price;
		this.bonusPoint = (int) (price / 10.0);
	}
}

class Tv extends Product {
	public Tv() {
		super(100);

	}

	@Override
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	public Computer() {
		super(200);

	}

	@Override
	public String toString() {
		return "Computer";
	}
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;

	public void buy(Product p) {
		if (money < p.price) {
			System.out.println("구매 불가. 잔액 부족");
			return;
		} else {
			this.money -= p.price;
			this.bonusPoint += p.bonusPoint;
			System.out.println(p + "을(를) 구입하셨습니다.");
		}
	}
}

public class Ex08 {

	public static void main(String[] args) {
		Buyer buyer = new Buyer();
		Tv tv = new Tv();
		Computer c = new Computer();

		buyer.buy(tv);
		System.out.println("현재 잔액 : " + buyer.money + "만 원");
		System.out.println("현재 보너스 점수 : " + buyer.bonusPoint + "포인트");

		buyer.buy(c);
		System.out.println("현재 잔액 : " + buyer.money + "만 원");
		System.out.println("현재 보너스 점수 : " + buyer.bonusPoint + "포인트");

	}

}
