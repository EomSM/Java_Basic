package day08;

class Product2{
	// 제품 가격
	int price;
	int bonusPoint;
	public Product2() { }
	public Product2(int price) {
		this.price = price;
		this.bonusPoint = (int)(price / 10.0);
	}
}
class Tv2 extends Product2{
	public Tv2() {
		super(100);
	}
	@Override
	public String toString() {
		return "Tv";
	}
}
class Computer2 extends Product2{
	public Computer2() {
		super(200);
	}
	@Override
	public String toString() {
		return "Computer";
	}
}
class Audio extends Product2{
	public Audio() {
		super(50);
	}
	public String toString() {
		return "Audio";
	}
}

class Buyer2{
	// 가지고 있는 금액
	int money = 1000;
	int bonusPoint = 0;
	
	Product2[] item = new Product2[10];
	int counter = 0;
	
	public void buy(Product2 p) {
		// 가지고 있는 금액보다 제품 가격이 더 비싼 경우
		if(money < p.price) {
			System.out.println("잔액이 부족해서 살 수 없습니다");
			return;
		}
		this.money -= p.price;
		this.bonusPoint += p.bonusPoint;
		
		// 구입한 제품을 Product2 배열에 저장하기
		item[counter++] = p;
				
		System.out.println(p + "을(를) 구입하셨습니다");
	}
  //구입한 제품의 정보 출력하기
  public void summary() {
  	// 구입한 제품 합계
  	int sum = 0;
  	
  	// 구입한 제품 목록
  	String itemList = "";
  	
  	// 구입한 제품 가격의 합계와 목록 작성하기
  	for(int i = 0; i < item.length; i++) {
  		if(item[i] == null) {
  			break;
  		}
  		// 제품 가격 합계 구하기
  		sum += item[i].price;
  		// 구입한 제품을 목록에 추가하기
  		itemList += 
  				(i == counter - 1) ? "" + item[i] : item[i] + ", ";
  	}
  	System.out.println("총구매액 : " + sum + "만원");
  	System.out.println("제품목록 : " + itemList);  	
  }
}

public class Ex09 {
  public static void main(String args[]) {
  	Buyer2 buyer = new Buyer2();
  	Tv2       tv = new Tv2();
  	Computer2  c = new Computer2();
  	
  	buyer.buy(tv);  	
  	buyer.buy(c);
  	buyer.buy(new Audio());
  	buyer.buy(new Tv2());
  	
  	buyer.summary();
  	
  }
}

