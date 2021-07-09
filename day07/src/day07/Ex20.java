package day07;

class Battleship {
}

class Destroyer extends Battleship {
}

class Cruiser extends Battleship {
}

public class Ex20 {

	public static void main(String[] args) {

//		Battleship bsh1 = new Battleship();
		Battleship bsh1 = new Destroyer();
		if (bsh1 instanceof Destroyer) {
			System.out.println("bsh1주소");
			Destroyer dst = (Destroyer) bsh1;
		}

		Destroyer dst1 = new Destroyer();
		bsh1 = dst1;

		Cruiser crs1 = new Cruiser();
		bsh1 = crs1;

	}

}
