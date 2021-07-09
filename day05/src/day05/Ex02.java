package day05;

public class Ex02 {

	public static void main(String[] args) {
		int[] numbers = new int[] { 1, 2, 3, 4, 5 };
		System.out.println(numbers);// 주소 : [I@182decdb
		System.out.println(numbers.length);
		
		int number=111;
		String name= new String("John");
				
		System.out.println(numbers[0]);

		int[][] figures = new int[2][3];
		figures=  new int[][] {{1,2,3},{4,5,6}}; //* 
		System.out.println(figures);//주소: [[I@7637f22
		System.out.println(figures.length);
		System.out.println(figures[0]);//주소:[I@4926097b
		System.out.println(figures[1]);//주소: [I@762efe5d
		System.out.println(figures[0][0]);
		System.out.println(figures[0][1]);
		System.out.println(figures[0][2]);
		System.out.println(figures[1][0]);
		System.out.println(figures[1][1]);
		System.out.println(figures[1][2]);
		
		System.out.println(figures[0][0]);
		
		int num = figures[0][1];
		System.out.println(num);

	
	//2차원 배열이다~
	
	}

}
