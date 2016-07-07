package projecteuler;

public class LargestPrime {

	public static long nthPrime(int n){
		int i = 1;
		long k = 2;
		while( i <= n){
			boolean isPrime = checkPrime(k);
			if (isPrime) i++;
			if(k == 2) 
				k = k+1; 
			else k = k + 2;
		}
		return k - 2;
	}
	
	public static boolean checkPrime(long k){
		for(int i = 3; i <= Math.sqrt(k); i++){
			if(k % i == 0) return false;
		}
		return true;
	}
	
	public static long largestPrime(long n){
		long max = 0;
		int i = 2;
		while(n > 1){
			if (n % i == 0){
				n = n/i;
				max = i;
			}
			if(i == 2)
				i = i+1;
			else i = i+2;
		}
		return max;
	}
	
	public static void main(String[] args){
		System.out.println(largestPrime(600851475143L));
		System.out.println(nthPrime(10001));
	}
}
