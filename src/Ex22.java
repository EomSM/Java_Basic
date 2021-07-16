import java.util.HashMap;
//HashMap :K 중복x /V o

public class Ex22 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put(new String("해리"), new Integer(95));
		map.put("헤르미온느", 100);
		map.put("론", 85);
		map.put("드레이코", 92);
		map.put("네빌", 70);

		
		//value를 ㅇㅓㄷ기 위해 get(key)
	Integer score=map.get("해리");
	System.out.println("해리의 점수는 "+score + "점");
		
	}// main	
}// class
