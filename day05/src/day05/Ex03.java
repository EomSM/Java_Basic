package day05;

public class Ex03 {

	public static void main(String[] args) {
		// 가변배열
		// ㄴ 이차원 배열에서 행의 크기는 같고 각 행의 열의 크기가 다른 배열

		int[] num = new int[5]; // 배열 생성 :00000 상태\

		for (int i = 0; i < num.length; i++) {
			System.out.printf("%d ", num[i]);
		}

		System.out.println("\n---------배열 생성, 메모리 할당만 해준 상태----");
		// num[0]=1; //10000 :배열 변수 num에 하나씩 입력하는 경우

		num = new int[] { 1, 2, 3, 4, 5 }; // 초기화 전체를 입력하는 경우. 12345 상태

		for (int i = 0; i < num.length; i++) {
			System.out.printf("%d ", num[i]);
		}

		System.out.println("\n----------배열초기화 한꺼번에 처리. 하나씩 넣었을 때와 위치는 다름. ----------");

		num = new int[] { 4, 5, 6 };

		for (int i = 0; i < num.length; i++) {
			System.out.printf("%d ", num[i]);
		}

		System.out.println("\n---------먼저 저장한 주소값이 바뀌어서 다른 형태의 배열이 됨----------");

		// 5x3
		int[][] numbers1 = new int[5][3];

		for (int i = 0; i < numbers1.length; i++) {
			for (int j = 0; j < numbers1[i].length; j++) {
				System.out.printf("%d ", numbers1[i][j]);
			}
			System.out.println();
		}
		System.out.println("\n--------5*3 행렬 만듬---------");

		numbers1[0][0] = 1;
		// 하나씩 집어넣으려 해도 인덱스 두번씩 지정해줘야 함> 15번 복사가 되니까...

		int figure = 10;

		for (int i = 0; i < numbers1.length; i++) {
			for (int j = 0; j < numbers1[i].length; j++) {
				numbers1[i][j] = ++figure;// 11~25까지 1씩 더하며 값 넣기
				System.out.printf("%d ", numbers1[i][j]);
			}
			System.out.println();
		}
		System.out.println("\n--------5*3 행렬 값 집어넣어 출력함--------");

		for (int i = 0; i < numbers1[2].length; i++) {
			System.out.printf("%d ", numbers1[2][i]);
		}
		System.out.println("\n----------- 2차원배열 numbers1의 인덱스 2 행.-----");

		// 가변배열 : 행만 지정, 열은 바뀔 것이기 때문에 지정하지 않음.
		// 행마다 1개씩의 1차원 배열들

		int[][] numbers2 = new int[5][];
		numbers2[0] = new int[] {1,2,3,4,5};
		
		numbers2[1] = new int[] {6,7};
				//길이를 서로 다르게 할 수 있음
		numbers2[2] = new int[] {8,9,10};
		numbers2[3] = new int[] {11,12,13,14};
		numbers2[4] = new int[] {15,16,17,18,19,20};
		
		//행의 개수가 각각 다르기 때문에 그 점을 고려해서 출력해야 함.
		
		for (int i = 0; i < numbers2.length; i++) {
			for (int j = 0; j < numbers2[i].length; j++) {
				System.out.printf("%2d ", numbers2[i][j]);
			}
			System.out.println();
		}
		System.out.println("\n--------5*n 가변행렬 출력됨. for문 구조는 같음.--");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}// m

}// c
