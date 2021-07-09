package day05;

import javax.swing.DefaultListSelectionModel;

class Tv {
	String color;
	String modelNumber;
	String modelName;
	boolean power;// 기본값false
	int channel;

	public void powerOnOff() {
		power = !power;
	}

	public void channelUp() {
		channel++;
	}

	public void channelUp1() {
		channel--;
	}

	public void info() {
		System.out.println("%s--%s--%s--%b --%d%nEK");
	}
}




public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Tv tv1 = new Tv();
	System.out.println(tv1.color);
	System.out.println(tv1.modelNumber);
	System.out.println(tv1.modelName);
	System.out.println(tv1.power);
	System.out.println(tv1.channel);//이것들에 이어 d시라누까지....!System.out.println(tv1.color);}

	Tv tv2 = new Tv();
	
	tv2.color="skyblue";
	tv2.modelNumber="skyblue";

	tv2.info();
	//졸려....

	Tv tv3 = new Tv();
	Tv tv4 = new Tv();
	tv3 = tv4;
	
	
	System.out.println("tv3.channel : " + tv3.channel );
//nhew기ㅏ 구권ㄷ.args.clone().clone().clone().clone().clone().clone().clone().clone()
	System.out.println("tv4.channel : " + tv4.channel);
	

	}}
