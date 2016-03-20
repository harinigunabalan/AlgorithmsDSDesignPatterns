package patterns.observer;

public class Observer2 extends Observer{
	
	public Observer2(observable obs){
		this.o = obs;
	}

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		System.out.println("Observer 2 implementation!");
		if(o.grade == 'S')
			System.out.println("Your grade is 10 points");
		else
			System.out.println("Your grade is less than 10 points");
	}

}
