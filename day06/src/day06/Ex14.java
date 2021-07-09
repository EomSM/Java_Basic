package day06;

class Data1 {
	int value;
	// public Data1() {} // 기본생성자

	public void setValue(int value) {
		this.value = value;
	}

}

class Data2 {
	int value;
	// public Data2() { } //매개변수 있는 생성자
	public Data2(int value) {
		this.value = value;// 이 클래스 멤버변수 value
	}

}

public class Ex14 {

	public static void main(String[] args) {
		Data1 d1 = new Data1();
		d1.setValue(555);
		System.out.println(d1.value);
		Data2 d2 = new Data2(11);
		// The constructor Data2() is undefined
		Data2 d2_1 = new Data2(16);
		Data2 d2_2 = new Data2();
	}

}
