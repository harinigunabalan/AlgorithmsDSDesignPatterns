package patterns.observer;

public class Observer1 extends Observer{

	public Observer1(observable obs){
		this.o = obs;
	}
	
	public void calculate(){
		System.out.println("Observer 1 implementation!");
		if(o.grade == 'S')
			System.out.println("Good");
		else	
			System.out.println("Bad");
	
	}
	
}
