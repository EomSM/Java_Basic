package day08;

/*다형성 polymorphism
상속  + 오버라이딩



*/
class Account1 {
	public void interestRate1() {
		System.out.println("1% 이자 지급");
	}
}

class Account3 extends Account1 {
	public void interestRate() {
		System.out.println("3% 이자 지급");
	}
}

class Account5 extends Account1 {
	public void interestRate() {
		System.out.println("5% 이자 지급");
	}
}

public class Ex06 {
public static void main(String[] args) {
	//아래의 경우ㅡ 명시적형 변환을 해야 함.
  	
	//상속관계 하에서 부모타입의 참조변수는 자식 클래스의 객체 주소 저장 가능. 
	//반대로 자녀 타입의 참조변수는 부모 클래스의 객체 주소를 저장할 수도 있고 못할 수도 있음. 
	// 할 수 있는 경우 : 자식 객체하고 같이 있지 않는 부모 객체의 주소
	Account1[] arrAcc = new Account1[5];
	arrAcc[0]= new Account1();
	arrAcc[1]= new Account3();
	arrAcc[2]= new Account5();
	arrAcc[3]= new Account5();
	arrAcc[4]= new Account3();
	
	///동일한 코드의 실행 결과가 런타임 시에 실행되는 객체에 따라서 다르게 나옴.  
	
	
	
	for (int i = 0; i < arrAcc.length; i++) {
		arrAcc[i].interestRate1();
	}



}
}
