package HashCodeEquals;

import java.util.HashSet;
import java.util.Set;

public class HashSetImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Person> persons = new HashSet<Person>();
		Person p1 = new Person(1, "6546757", "A1");
		Person p2 = new Person(2, "6546757", "A2");
		Person p3 = new Person(1, "6546757", "A1");
		persons.add(p1);
		persons.add(p2);
		
		for (Person p : persons){
			System.out.println(p);
		}
		System.out.println("hashcode of p1: " +p1.hashCode());
		System.out.println("hashcode of p3: " +p3.hashCode());
		
		if(p1.equals(p3))
			System.out.println("P1 and P3 are equal");
		
		if(persons.contains(p3))
			System.out.println("Exists in the HashSet");
		else
			System.out.println("Doesnt exist in the Set");
	}

}
