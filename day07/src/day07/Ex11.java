package day07;


class Card{
	// 카드의 무늬 개수
	static final int MAX_KIND = 4;  
	// 무늬별 카드 개수
	static final int MAX_NUM = 13;
	
	static final int SPADE = 4;
	static final int DIAMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;
	
	int kind;
	int number;
			
	public Card() {
		this(SPADE, 1);
	}
	public Card(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	@Override
	public String toString() {
		String[] kinds = {"", "CLOVER","HEART","DIAMOND","SPADE"};
		String numbers = "0123456789XJQK";
		
		return "kind : " + kinds[this.kind] + 
			 ", number : " + numbers.charAt(this.number);
	}
}

class Deck{
	// 카드의 개수
	final int NUM_CARD = 52;
	Card[] arrCards = new Card[NUM_CARD];
	
	// Deck에 들어있는 Card 초기화하기
	public Deck() {
		int i = 0;        // 4  
		for(int k = Card.MAX_KIND; k > 0; k--) {
			                       // 13
			for(int n = 0; n < Card.MAX_NUM; n++) {
				arrCards[i++] = new Card(k, n+1);
			}
		}
	} // 기본 생성자
	
	// 지정된 위치(index)에 있는 Card하나 선택하기
	public Card pick(int idx) {
		return arrCards[idx];
	}
	
	// Deck에서 Card 하나 선택하기
	public Card pick() {
	  int idx = (int)(Math.random()*NUM_CARD);
	  // Card c = pick(idx);
	  // return c;
	  return pick(idx);
	}
	
	// Card 순서 섞기
	public void shuffle() {
		for(int i = 0; i < arrCards.length; i++) {
			int idx = (int)(Math.random()*NUM_CARD);
			
			Card cup = arrCards[i];
			arrCards[i] = arrCards[idx];
			arrCards[idx] = cup;
		}
	}
}

public class Ex11 {
  public static void main(String args[]) {
  	// Card 한 벌 만들기
  	Deck deck = new Deck();
  	
  	// Card 섞기 전에 맨 위에 있는 Card 뽑기
  	Card card = deck.pick(0);
  	System.out.println("card - " + card);
  	
  	// Card 섞기
  	deck.shuffle();
  	
    // Card 섞은 후에 맨 위에 있는 Card 뽑기
  	card = deck.pick(0);
  	System.out.println("card - " + card);
  	
  }
}

