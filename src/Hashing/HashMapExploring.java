package Hashing;

import java.util.HashMap;
import java.util.Map;

class Employee {
	int age;
	String name;

	Employee(int age, String name) {
		this.age = age;
		this.name = name;
	}

	void print(int a) {

		System.out.println(name + "  " + age);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		int a = this.age + this.name.hashCode();
		return a;
		// else
		// return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (this.age == ((Employee) obj).age
				&& this.name == ((Employee) obj).name)
			return true;
		else
			return false;
	}
}

public class HashMapExploring {

	public static void main(String[] args) {

		Map<Employee, String> mp = new HashMap<Employee, String>();

		Employee e1 = new Employee(25, "A");
		Employee e2 = new Employee(25, "A");
		// System.out.println(p1.hashCode());
		// System.out.println(p2.hashCode());
		mp.put(e1, "ravi1");
		mp.put(e2, "ravi2");

		// System.out.println(e1.hashCode());
		// System.out.println(e2.hashCode());

		// System.out.println(e1.equals(e2));

		System.out.println(mp.get(e1)); // it should show ravi2 //previous value
										// get overrided bcoz equal objects and
										// hence same hascode

		// we need to override hashCode also, when we override equals bcoz if we
		// dnt do so , it means then equal objects can have different hashcodes
		// and hence will get stored in hashcode at different places, but we
		// know hashmao doesnt allow duplicate values and overrides the previous
		// one.
		// so to save equal objects at same place, it should have same hashcode
		// and to guarrantee that we should override hashcode method as well.

	}
}
