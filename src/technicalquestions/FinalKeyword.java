package technicalquestions;

public class FinalKeyword {
	
	
	public static void main(String[] args){
		FinalKeyword fk = new FinalKeyword();
		fk.foo();
	}
	
	
	public void foo(){
		int x = 10;
		Thread t1 = new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				final int i = x;
				System.out.println(i);
				
			}
			
		});
		t1.start();
		
	}
	
}
