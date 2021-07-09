package day05;

/*method overloading
메소드 매개변수의 타입, 순서, 개수가 달라지더라도 같은 이름의 메소드에선 오류 발생하진 않음 
*/

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(123,456));
		System.out.println(add(1, 0.5F));
		System.out.println(add(36.78F, 32)) ;
		System.out.println(add(14,16,13));
		System.out.println(add(12,23,24,12));
	}

	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;

	}

	public static float add(int n1, float n2) {
		float result = n1 + n2;
		return result;

	}

	public static float add(float n1, float n2) {
		float result = n1 + n2;
		return result;

	}

	public static int add(int n1, int n2, int n3) {
		int result = n1 + n2 + n3;
		return result;

	}

	public static int add(int n1, int n2, int n3, int n4) {
		int result = n1 + n2 + n3 + n4;
		return result;

	}
}
