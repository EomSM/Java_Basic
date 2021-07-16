import java.io.ObjectInputStream.GetField;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex27 {
	public static void main(String[] args) {
		String[] data = { "A", "K", "L", "C ", "B", "A", "C", "B", "B", "C", "G", "K" };

		HashMap map = new HashMap();
		for (int i = 0; i < data.length; i++) {
			if (map.containsKey(data[i])) { // 개수만큼 반복
				Integer value = (Integer) map.get(data[i]);// 반복되는 거 오면서 true가 됨
				map.put(data[i], new Integer(value.intValue()) + 1); // 기존 value + 1로 누적 저장.
			} else {
				map.put(data[i], 1);// 처음에는 기존 값 없으니까 이걸로 시작. A: 1이 됨.
			}

		} // for

		Set set = map.entrySet();
		Iterator iter = set.iterator();

		while (iter.hasNext()) {
			Map.Entry me = (Map.Entry) iter.next();
			int value = ((Integer) me.getValue()).intValue();
			System.out.println(me.getKey() + " : " + value + " 개");
		} // While

	}// main
}// class
