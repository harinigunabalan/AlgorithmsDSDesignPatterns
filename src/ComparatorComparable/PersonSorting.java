package ComparatorComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonSorting {
	public static void main(String[] args){
		Person p1 = new Person("Mom", Person.sex.FEMALE, 55, "a1@test.com");
		Person p2 = new Person("Son1", Person.sex.MALE, 20, "a1@test.com");
		Person p3 = new Person("Daughter1", Person.sex.FEMALE, 15, "a1@test.com");
		Person p4 = new Person("Daughter2", Person.sex.FEMALE, 13, "a1@test.com");
		Person p5 = new Person("Dad", Person.sex.MALE, 57, "a1@test.com");
		
		List<Person> persons = new ArrayList<Person>();
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);
		persons.add(p5);
		
		System.out.println(persons);
		System.out.println("--------------------");
		
		Collections.sort(persons);
		System.out.println(persons);
		System.out.println("--------------------");
		
		persons.sort(new NameOrderComparator());
		
		System.out.println(persons);
		System.out.println("--------------------");
		
	}
}
