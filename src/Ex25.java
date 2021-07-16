import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.lang.model.type.IntersectionType;

public class Ex25 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("이순신", 90);
		map.put("안중근", 100);
		map.put("양만춘", 100);
		map.put("김유신", 80);
		map.put("유관순", 90);

		Set set = map.entrySet();
		Iterator iter = set.iterator();

		while (iter.hasNext()) {
			Map.Entry me = (Map.Entry) iter.next();
			System.out.println("이름 : " + me.getKey() + ", 점수 : " + me.getValue());
		}

		System.out.println("-------------------------");
		Collection values = map.values();
		// s 안 붙음 : 인터페이스.
		Iterator iter2 = values.iterator();

		int total = 0;
		float average = 0.0F;
		int Max_score = 0;
		int Min_score = 0;

		while (iter2.hasNext()) {
			Integer scores = (Integer) iter2.next();
			total += scores;// 총점
		}

		average = (float) total / map.size();

		Max_score = (int) Collections.max(values);
		Min_score = (int) Collections.min(values);

		System.out.println("총점 : " + total);
		System.out.println("평균 : " + average);
		System.out.println("최고점 : " + Max_score);
		System.out.println("최저점 : " + Min_score);

		System.out.println("-------------------------------");

		Collection keys = map.keySet();

		Iterator iter3 = keys.iterator();
		while (iter3.hasNext()) {
			String name = (String) iter3.next();
			System.out.println(name);
		}

		System.out.println("-------------------------------");
	}

}
