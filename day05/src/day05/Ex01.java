package day05;

public class Ex01 {

	public static void main(String[] args) {
		// 행렬의 곱을 2차원 배열로.
		//m1=2*3, m2=3*2	m3=2*2
		//1 2 3		1 2			22 28
		//4 5 6		3 4			49 64
		//				5 6
		int[][] m1 = { { 1, 2, 3 }, { 4, 5, 6 } };

		int[][] m2 = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

		// m1배열의 행의 길이 : 2
		final int ROW_M1 = m1.length;
		// m2 배열의 행의 길이 : 3
		final int ROW_M2 = m2.length;
		// m2 배열의 열의 길이 : 2
		final int COL_M2 = m2[0].length;
		// m3 = m1*2 결과 저장할 배열
		int[][] m3 = new int[ROW_M1][COL_M2];

		
		//행렬에 대한 for문.> 이중으로. 
		
		for (int i = 0; i < ROW_M1; i++) {
			for (int j = 0; j < COL_M2; j++) {
				for (int k = 0; k < ROW_M2; k++) {
					m3[i][j] += m1[i][k] * m2[k][j];
					
					
					
				}
			}
		}//첫 for문
		for (int i = 0; i < ROW_M1; i++) {
			for (int j = 0; j < COL_M2; j++) {
				for (int k = 0; k < ROW_M2; k++) {
				System.out.printf("%2d ", m3[i][j]);
				}
				
			}				System.out.println();

			}
		
		
		
		
	}// main

}// class
