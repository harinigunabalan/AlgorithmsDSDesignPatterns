package ctci;

public class ZerosInFactorial {
	
	public static int ZerosFactorial(int n){
		int count = 0;
		if(n < 5) return 0;
		for(int i = 5; i <=n ; i*=5){
			count = count + n/i; 
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(ZerosFactorial(125));
		
	}

}
