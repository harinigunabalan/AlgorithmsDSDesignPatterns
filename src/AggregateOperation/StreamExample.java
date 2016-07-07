package AggregateOperation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import AggregateOperation.Person.sex;

public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> roster = new ArrayList<Person>();
		Person p1 = new Person("A1", Person.sex.FEMALE, 25, "a1@gmail.com" );
		Person p2 = new Person("A2", Person.sex.MALE, 26, "gtrghtrhg@gmail.com" );
		Person p3 = new Person("A3", Person.sex.MALE, 35, "sdfgdg@gmail.com" );
		Person p4 = new Person("A4", Person.sex.FEMALE, 25, "thrth@gmail.com" );
		Person p5 = new Person("A5", Person.sex.MALE, 35, "tfgsrhbrtg@gmail.com" );
		Person p6 = new Person("A6", Person.sex.MALE, 28, "thsrtjhtzjtz@gmail.com" );
		Person p7 = new Person("A7", Person.sex.MALE, 29, "rawerrtjhtzj@gmail.com" );
		Person p8 = new Person("A8", Person.sex.MALE, 35, "ertwerzhtjh@gmail.com" );
		Person p9 = new Person("A9", Person.sex.MALE, 29, "ertr5uztj@gmail.com" );
		Person p10 = new Person("A10", Person.sex.FEMALE, 25, "dfghfzjhtz@gmail.com" );
		
		roster.add(p1);
		roster.add(p2);
		roster.add(p3);		
		roster.add(p4);
		roster.add(p5);
		roster.add(p6);
		roster.add(p7);
		roster.add(p8);
		roster.add(p9);
		roster.add(p10);
		
		roster.stream().forEach(arg0 -> System.out.println(arg0.getEmail()));
		System.out.println(); System.out.println();
		roster.stream().filter(arg0 -> arg0.getGender() == Person.sex.FEMALE).forEach(arg0 -> System.out.println(arg0.getName()));
		System.out.println(); System.out.println();
		double age = roster.stream().filter(arg0 -> arg0.getGender() == Person.sex.MALE).mapToInt(e -> e.getAge()).average().getAsDouble();
		System.out.println(age);		
		
		int  sum = roster.parallelStream().map(Person::getAge).reduce(0, (a,b) -> a > b ? a : b );
		int sum1 = roster.parallelStream().mapToInt(arg0 -> arg0.getAge()).sum();
		System.out.println("Sum: " + sum);
		System.out.println("Sum through sum function:" + sum1);
		
		int max = roster.parallelStream().mapToInt(Person::getAge).max().getAsInt();
		System.out.println(max);
		
		Map<sex, List<Person>> groupPersons = new HashMap<Person.sex, List<Person>>(); 
			groupPersons = roster.parallelStream().collect(Collectors.groupingBy(Person::getGender));

			
	}

}
