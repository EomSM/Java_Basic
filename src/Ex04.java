import java.util.Vector;

public class Ex04 {

	public static void main(String[] args) {
		// arraylist 의 구 버전에 해당하는 Vector:
		// 차이점 : 동기화가 기본으로 되어 있음 - 속도가 느림.
		// = 멀티 스레드가 안 됨

		// 프로세스 = 자원 + 쓰레드
		// 스레드 = 프로그램의 물리적인 흐름
		// 공유데이터의 일관성 유지가 필요

		// single thread <- main
		// multi threads < -
		// capacity

		Vector v = new Vector<String>(5);
		v.add("1");
		v.add("2");
		v.add("3");

		printVector(v);

		v.trimToSize();
		// size = capacity로 하게 만드는. 빈공간 없애는 메소드
		System.out.println("---------trimToSize--------------");
		printVector(v);

		v.ensureCapacity(6);
		System.out.println("---------ensureCapacity--------------");
		printVector(v);

		v.setSize(7);
		System.out.println("-===========setSize(7)");
		printVector(v);

		v.clear();
		System.out.println("-===========clear()");
		printVector(v);

	}// main

	public static void printVector(Vector v) {
		System.out.println(v);
		System.out.println("size : " + v.size());
		System.out.println("capacity : " + v.capacity());
		System.out.println("===========================");
	}

}// class
