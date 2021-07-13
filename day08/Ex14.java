package day08;

abstract class Unit {
	int x, y;

	abstract void move(int x, int y);

	public void stop() {

	}

}// Unit

class Marine extends Unit {
	@Override
	public void move(int x, int y) {
		System.out.println("Marine's movement to (" + x + ", " + y + ")");

	}// move

	public void stimPack() {
	}
}// Marine

class Tank extends Unit {
	@Override
	public void move(int x, int y) {
		System.out.println("tank's movement to (" + x + ", " + y + ")");

	}// move

	public void changeMode() {
	}
}// Tank

class Dropship extends Unit {
	@Override
	public void move(int x, int y) {
		System.out.println("dropship's movement to (" + x + ", " + y + ")");

	}// move

	public void load() {
	}

	public void unload() {

	}
}// dropship

public class Ex14 {
	public static void main(String[] args) {
		Unit[] unit = new Unit[5];
		unit[0] = new Marine();
		unit[1] = new Tank();
		unit[2] = new Dropship();
		unit[3] = new Marine();
		unit[4] = new Marine();

		for (int i = 0; i < unit.length; i++) {
			unit[i].move(111, 222);
		}
		
		
	} // main
} // class
