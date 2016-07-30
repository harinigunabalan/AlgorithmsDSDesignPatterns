 package NumericComputation;

import java.util.ArrayList;

public class PowersOf2 {

	public static int powersOf2(int n){
		if(n < 0)
			return 0;
		else if(n == 1){
			System.out.println("1");
			return 1;
		}	
		else{
			int prev = powersOf2(n/2);
			int curr = prev * 2;
			System.out.println(curr);
			return curr;
		}
	}
	
	public static void main(String[] args){
		powersOf2(50);
		int a = 23;
		int b = 19;
		
		System.out.println("a is :" + a + "b is : " + b);
		a = a - b;
		b = b + a;
		a = b - a;
		System.out.println("a is :" + a + "b is : " + b);
		ArrayList<Integer> al = new ArrayList<Integer>();
		
	}
	
	
}
