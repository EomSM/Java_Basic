import java.util.Arrays;
import java.util.Comparator;

public class Ex14 {
	public static void main(String[] args) {
		Integer[] arrNums = new Integer[] { 3, 5, 1, 4, 2 };
		System.out.println(Arrays.toString(arrNums));
		System.out.println("================================");

		Arrays.sort(arrNums);
		System.out.println(Arrays.toString(arrNums));
		System.out.println("================================");

  	// 내림차순 정렬
		
  	Arrays.sort(arrNums, new DescendingCompare());
  	System.out.println(Arrays.toString(arrNums));
  	System.out.println("--------------------------");
	} // main
}// class

class DescendingCompare implements Comparator {
/*오름차순 정렬에서 사용(기본 설정)
	A.compareTo(B)
	A>B:	1
	A=B:	0
	A<B:	-1

	B.compareTo(B)
	A>B:	-1
	A=B:	0
	A<B:	1

*/
	
	@Override
	public int compare(Object o1, Object o2) {
 if (o1 instanceof Integer && o2 instanceof Integer) {
	Integer num1 = (Integer)o1;
	Integer num2 = (Integer)o2;
//	return	num1.compareTo(num2);
	//내림차수 ㄴ
	return	num2.compareTo(num1);
//	Arrays.sort(Arrays.toString(());
 
 }

 
 return -1;
 
 
	}
}