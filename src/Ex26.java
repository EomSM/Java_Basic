import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex26 {
	static HashMap phoneBook = new HashMap();

	public static void addGroup(String groupName) {
		if (!phoneBook.containsKey(groupName)) {
			phoneBook.put(groupName, new HashMap());
		}
	}// addGroup

	public static void addPhoneNo(String groupName, String name, String phone) {
		addGroup(groupName);
		HashMap group = (HashMap) phoneBook.get(groupName);
		group.put(phone, name);
	}

	public static void addPhoneNo(String name, String phone) {
		addPhoneNo("기타", name, phone);
	}

//목록 출력
	public static void phoneList() {
		Set set = phoneBook.entrySet();
		Iterator iter = set.iterator();
		while (iter.hasNext()) {
			Map.Entry me = (Map.Entry) iter.next();
			// me : key groupname/ value hashmap
			Set subSet = ((HashMap) me.getValue()).entrySet();

			Iterator subIter = subSet.iterator();
			System.out.println(me.getKey() + "[" + subSet.size() + "]");
			// 회사[10]

			while (subIter.hasNext()) {
				Map.Entry subMe = (Map.Entry) subIter.next();
				String phoneNo = (String) subMe.getKey();
				String name = (String) subMe.getValue();
				System.out.println(name + " : " + phoneNo);
			} // inner while

		} // while
	}// phoneList

	public static void main(String[] args) {
		addPhoneNo("친구", "이순신", "010-0000-0000");
		addPhoneNo("친구", "김순신", "010-1111-0000");
		addPhoneNo("친구", "박순신", "010-2222-0000");
		addPhoneNo("학교", "김유신", "010-1000-1000");
		addPhoneNo("학교", "이유신", "010-2000-2000");
		addPhoneNo("학교", "박유신", "010-3000-3000");

		addPhoneNo("기타", "안중근", "010-7979-7979");
		phoneList();
	}
}// Ex26class
