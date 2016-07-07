package thesis;

public class MyThread implements Runnable {

	RandomComputation rc = new RandomComputation();
	
	public MyThread(RandomComputation rc){
		this.rc = rc;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		rc.increment();
	}

}
