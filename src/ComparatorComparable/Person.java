package ComparatorComparable;

public class Person implements Comparable{
	String name;
	public enum sex{
		MALE, FEMALE
	}
	sex gender;
	int age;
	String email;

	public Person(String name, sex gender, int age, String email) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public sex getGender() {
		return gender;
	}
	public void setGender(sex gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", age=" + age + ", email=" + email + "]";
	}
	@Override
	public int compareTo(Object o) {
		Person p = (Person) o;
		if(this.age > p.age)
			return 1;
		else if (this.age == p.age)
			return 0;
		else 
			return -1;
	}
}
