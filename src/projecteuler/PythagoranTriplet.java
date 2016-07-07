package projecteuler;

import java.util.NavigableMap;

public class PythagoranTriplet {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i < 999; i++){
			for(int j = 1; j < 999; j++){
				int k = 1000 - j - i;
					if(i*i + j*j == k*k){
						System.out.println("The numbers are:" + i + " " + j + " " + k);
						System.out.println("Product: " + i*j*k);
						return;
					}	
			}
		}
		
	}

}
