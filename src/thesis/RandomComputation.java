package thesis;

import java.util.Date;

public class RandomComputation{

    private int counter = 0;   
    
	public synchronized void increment(){

		counter++;
		System.out.println(counter);

	}
	
	public void PerformRandomWait(){
		long random_number = (long) (Math.random() * 5000);
		if(random_number > 0){
			synchronized(this){
				try {
					this.wait(random_number);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
	public void ComputeRandomFibonacchi(){		
		int random_number = (int) (Math.random() * 38);		
		
		long lStartTime = new Date().getTime();
		for(int i=1; i<=random_number; i++){
			fibonacciRecusion(i);
        }			
    	long lEndTime = new Date().getTime();
    	long difference = lEndTime - lStartTime;    	
    	
    	/*lStartTime = new Date().getTime();
		for(int i=1; i<=random_number; i++){
            System.out.println(i + "-" + fibonacciLoop(i) +" ");
        }			
		lEndTime = new Date().getTime();
    	difference = lEndTime - lStartTime;
    	System.out.println("Elapsed milliseconds for Looping: " + difference);*/
	}
		  
    public long fibonacciRecusion(int number){
        if(number == 1 || number == 2){
            return 1;
        }
        return fibonacciRecusion(number-1) + fibonacciRecusion(number -2); //tail recursion
    }
    
    public int fibonacciLoop(int number){
        if(number == 1 || number == 2){
            return 1;
        }
        int fibo1=1, fibo2=1, fibonacci=1;
        for(int i= 3; i<= number; i++){
            fibonacci = fibo1 + fibo2; //Fibonacci number is sum of previous two Fibonacci number
            fibo1 = fibo2;
            fibo2 = fibonacci;
 
        }
        return fibonacci; //Fibonacci number
    }     
    
    public static void main(String[] args){
    	RandomComputation rc1 = new RandomComputation();
    	RandomComputation rc2 = new RandomComputation();
    	
    	MyThread mt1 = new MyThread(rc1);
    	MyThread mt2 = new MyThread(rc1);
    	
    	Thread t1 = new Thread(mt1);
    	Thread t2 = new Thread(mt2);
    	
    	t1.start();
    	t2.start();
    	
    }
    
}
  
