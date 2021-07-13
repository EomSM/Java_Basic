package day08;

import java.util.ArrayList;

class Product3 {
	// 제품 가격
	int price;
	int bonusPoint;

	public Product3() {
	}

	public Product3(int price) {
		this.price = price;
		this.bonusPoint = (int) (price / 10.0);
	}
}

class Tv3 extends Product3 {
	public Tv3() {
		super(100);
	}

	@Override
	public String toString() {
		return "Tv";
	}
}

class Computer3 extends Product3 {
	public Computer3() {
		super(200);
	}

	@Override
	public String toString() {
		return "Computer";
	}
}

class Audio3 extends Product3 {
	public Audio3() {
		super(50);
	}

	public String toString() {
		return "Audio";
	}
}

class Speaker3 extends Product3 {
	public Speaker3() {
		super(50);
	}

	public String toString() {
		return "Speaker";
	}

}

class Buyer3 {
	// 가지고 있는 금액
	int money = 1000;
	int bonusPoint = 0;

//	Product3[] item = new Product3[10];
//	int counter = 0;

	// 콜렉션 사용.
	ArrayList<Product3> item = new ArrayList<Product3>();

	public void buy(Product3 p) {
		// 가지고 있는 금액보다 제품 가격이 더 비싼 경우
		if (money < p.price) {
			System.out.println("잔액이 부족해서 살 수 없습니다");
			return;
		}
		this.money -= p.price;
		this.bonusPoint += p.bonusPoint;

		// 구입한 제품을 Product2 배열에 저장하기
		item.add(p);
		System.out.println(p + "을(를) 구입하셨습니다");
	}

//구입 제품 반환
	public void refund(Product3 p) {
		if (item.remove(p)) {
			this.money += p.price;
			this.bonusPoint -= p.bonusPoint;
			System.out.println(p + "을(를) 반품하셨습니다");
		} else {
			System.out.println("구입하신 제품 목록에 해당 상품이 없습니다.");
		}

	}// refund

	// 구입한 제품의 정보 출력하기
	public void summary() {
		// 구입한 제품 합계
		int sum = 0;

		// 구입한 제품 목록
		String itemList = "";

		// 구입한 제품 가격의 합계와 목록 작성하기
		for (int i = 0; i < item.size(); i++) {
			if (item.isEmpty()) {
				System.out.println("구입하신 제품이 없습니다.");
				return;
			}
			// 제품 가격 합계 구하기
			Product3 p = item.get(i);
			sum += p.price;
//			sum += item.get(i).price;
			// 구입한 제품을 목록에 추가하기
			itemList += (i == 0) ? "" + p : ", " + p;
		}
		System.out.println("총구매액 : " + sum + "만원");
		System.out.println("제품목록 : " + itemList);
	}
}

public class Ex10 {
	public static void main(String args[]) {
		Buyer3 buyer = new Buyer3();
		Tv3 tv = new Tv3();
		Computer3 c = new Computer3();

		buyer.buy(tv);
		buyer.buy(c);
		buyer.buy(new Audio3());
		buyer.buy(new Tv3());
		buyer.buy(new Speaker3());

		buyer.summary();

		System.out.println("----------------------");
		buyer.summary();

		buyer.refund(tv
				);
		buyer.summary();

	}
}
