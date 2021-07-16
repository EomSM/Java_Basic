import java.util.HashSet;

public class Ex19 {
	public static void main(String[] args) {
		HashSet set = new HashSet();

		Person p1 = new Person("Paul", 12);
		Person p2 = new Person("Paul", 12);
		
		set.add("abc");
		set.add("abc"); // 하나만 들어감 : 중복 허용 안하기 때문에.
		set.add(new Person("Paul", 12));
		set.add(new Person("Paul", 12));
		System.out.println(set);
		System.out.println("p1.equals(p2): " + p1.equals(p2));
	}// main
}// class

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + ": " + age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person p = (Person) obj;
			return (this.name == p.name && this.age == p.age);
		} // 문자열 비교 ; 값 비교 > True로 나올 때
		return false;
	}

	@Override
	public int hashCode() {
		return (this.name + this.age).hashCode();
	}
}// class Person