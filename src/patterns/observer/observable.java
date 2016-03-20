package patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class observable {

	char grade;
	List<Observer> observers = new ArrayList<Observer>();
	
	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
		notifyAllObservers();
	}	
	
	public void addObserver(Observer o){
		observers.add(o);
	}
	
	public void notifyAllObservers(){
		for(Observer o1 : observers){
			o1.calculate();
		}
	}
	
	public static void main(String[] args){
		
		observable object = new observable();
		object.addObserver(new Observer1(object));
		object.addObserver(new Observer2(object));
		object.setGrade('S');
		object.setGrade('A');
	}
}
