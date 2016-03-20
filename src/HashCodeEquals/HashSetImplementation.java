package HashCodeEquals;

import java.util.HashSet;
import java.util.Set;

public class HashSetImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Person> persons = new HashSet<Person>();
		Person p1 = new Person(1, "6546757", "Harini");
		Person p2 = new Person(2, "6546757", "Hari");
		Person p3 = new Person(1, "6546757", "Harini");
		persons.add(p1);
		persons.add(p2);
		
		for (Person p : persons){
			System.out.println(p);
		}
		
		if(p1.equals(p3))
			System.out.println("P1 and P3 are equal");
		
		if(persons.contains(p3))
			System.out.println("Exists in the HashSet");
		else
			System.out.println("Doesnt exist in the Set");
	}

}
