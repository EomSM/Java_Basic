package day07;

class Item {
	int i;

}

class User {
	Item item;
	int i;
	int[] arrNums;

	public User() {
		this.i = 222;
		arrNums = new int[3];
	}
}

public class Ex16 {

	public static void main(String[] args) {
		User user = new User();
		System.out.println("user.i : " + user.i);
		System.out.println("arrNum : " + user.arrNums);
		System.out.println("arrNum[0] : " + user.arrNums[0]);
		System.out.println("arrNum[1] : " + user.arrNums[1]);
		System.out.println("arrNum[2] : " + user.arrNums[2]);

		user.item = new Item();
		user.item.i= 111;
		System.out.println("user.item.i : " + user.item.i);
	}

}
