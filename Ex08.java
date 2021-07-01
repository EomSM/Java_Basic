package day01;

public class Ex08 {

	public static void main(String[] args) {

		byte b1 = 11;
		byte b2 = 22;
		byte b3 = (byte) (b1 + b2);

		System.out.println(b3);
		// 형변환
		// 일부가 아닌 연산된 전체를 byte로 형변환 해야 데이터 손실이 없게 하려 함을 표시

		int num = (int) b3;
		b2 = (byte) num;

		System.out.println(b1 + ", " + b2);
		// 데이터 손실이 일어나지 않음> byte가 더 큰 int로 감 : 왼쪽에 저장이 됨 :
		// 저장되는 목적지를 기준으로 형변환 표시를 하느냐 마느냐를 결정.

		// type: 데이터를 저장하는 공간의 크기와 모양.
		// 형변환 : 타입을 변경함
		// 데이터의 손실이 일어날 수 있는 경우(크기가 큰 것에서 작은 것으로 내려갈 경우),
		// (명시적) 형변환을 해 주어야 함.
		// cf. 묵시적 형변환 : 데이터 손실이 일어나지 않은 경우.

		byte bt1;
		short sh1;
		int num1;
		char ch1 = 'A';

		bt1 = 11;
		sh1 = 22;
		num1 = 33;

		ch1 = (char)bt1;
		bt1 = (byte)sh1;
		sh1 = (short)ch1;
		num = ch1;
		System.out.println(ch1);

	}

}
