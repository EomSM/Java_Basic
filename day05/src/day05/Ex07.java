package day05;
/*
heap memory
프로그램 실행 중에 동적으로 생성(할당)되는 메모리 공간
new  연산자에 의해 생성되는 메모리 공간
1) 동적 data들을 저장 (object, Array data)
2) 자동 초기화 지원됨 > 명시적으로 초기화하지 않으면 각 자료형의 기본값으로 자동 초기화됨.
3) (그 주소지를 찾아가 데이터를 확인할 수 있는=)참조(reference)가 더이상 없는 경우 : Garbage collector의 수집 대상이 됨.
 -> 자동으로 메모리를 관리함.
object
student class의  instance를 생성  
*/
public class Ex07 {

	public static void main(String[] args) {
		String name = new String("이순신");
		name=null; //이게 기본값. 주소를 할당받지 않은 상태.
		System.out.println(name); //string 객체와 메모리 할당 x < - 다시 ""를 가져오지 않음  : 참조가 더이상 없는 상태.
		
		
	}

}
