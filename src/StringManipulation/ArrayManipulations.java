package StringManipulation;

import java.util.Arrays;

public class ArrayManipulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] test = {1,2,3,5,6,9,3,6,8,9,2,3,0,5};
		Arrays.sort(test);
		for(int i = 0; i< test.length; i++){
			System.out.print(test[i] + " ");
		}
		
		String abc = "hello here! ";
		System.out.println(abc.substring(5));
		System.out.println(abc.substring(0, 5));

		
	}

}
