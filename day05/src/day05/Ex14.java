package day05;

/*
접근제한자 access modifier
private<default<protected<public

*/

class Account {

	private int balance;// 잔액

	public void initBalance(int money) {
		balance = money;
		System.out.println("개좌 개설을 축하드립니다.");
		
		displayBalance();
		return;
	}

	public int getBalance() {
		return balance;
	}

	public void deposit(int money) {
		if (money > 0) {
			balance += money;
			displayBalance();
		} else {
			System.out.println("입금 금액을 재확인해주세요");
			displayBalance();

		}

	}

	public void withdraw(int money) {
		if(money <= balance) {
			balance -= money;
				} else {
					System.out.println("잔액이 부족합니다. 출금 금액을 재확인해주세요");
					displayBalance();

				}

			}

	public void displayBalance() {
		System.out.printf("현재 잔액은 %d원 입니다%n", getBalance());
	}
	
	
	
}

public class Ex14 {

	public static void main(String[] args) {
		Account acc = new Account();
//		acc.balance = 10000;
//	The field Account.balance is not visible
		acc.initBalance(10000);
		acc.deposit(8000);
		acc.deposit(6000);

		
		acc.withdraw(5000);
		acc.withdraw(9000);
		
		acc.deposit(3000);
		acc.withdraw(20000);
		
		acc.deposit(- 7000);
		
	}

}
