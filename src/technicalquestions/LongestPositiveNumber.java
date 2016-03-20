package technicalquestions;

import java.util.ArrayList;
import java.util.List;

public class LongestPositiveNumber {
	static int[] arr = {1,2,-3,2,3,4,-6,1,2,3,4,5,-8,5,6};
	
	public static void main(String[] args){
		
		int count = 0, out = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > 0)
				count++;
			else{
				if (out < count)
					out = count;
				count = 0;
			}
		}
		System.out.println(out);
	}
	
}
