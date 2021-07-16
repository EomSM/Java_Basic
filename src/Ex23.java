import java.util.HashMap;

class Name {
	String firstName;
	String lastName;

	public Name(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}// 구성자

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Name) {
			Name n = (Name) obj;
			return (this.firstName == n.firstName 
					&& this.lastName == n.lastName);
		}

		return false;
	}

	@Override
	public int hashCode() {
		return (this.firstName +this.lastName).hashCode();
	}
}

public class Ex23 {
	public static void main(String[] args) {
		HashMap<Name, Integer> map = new HashMap<>();
		Name n1 = (new Name("해리", "포터"));
		map.put(n1, 95);
		map.put(new Name("헤르미온느", "그래인저"), 100);
		map.put(new Name("론", "위즐리"), 85);
		map.put(new Name("드레이코", "말포이"), 93);
		map.put(new Name("네빌", "롱버텀"), 70);

		// nullpointexception
		Integer score = map.get(n1);
		System.out.println(n1.firstName + n1.lastName + "의 점수는 " + score);
		
	System.out.println();	
	}// main
}// Ex23
