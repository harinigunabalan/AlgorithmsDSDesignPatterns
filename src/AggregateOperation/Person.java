package AggregateOperation;

public class Person {
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
	
	
}
