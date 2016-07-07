package ctci;

import java.util.Arrays;

public class ArraysSmallestDiff {

	public static int smallestDiff(int[] a, int [] b){
		Arrays.sort(a);
		Arrays.sort(b);
		int i = 0, j = 0, min = 2147483647;
		while(i < a.length && j < b.length){
			min = Math.min(min, Math.abs(a[i] - b[j]));
			if(a[i] == b[j]) return 0;
			else if(a[i] > b[j])
				j++;
			else
				i++;
		}
		return min;
	}
	
	public static void main(String[] args){
		
		int[] a = {34,65,24,56,24,74,97,12};
		
		int [] b = {7, 84,93,26,98,18,63,19};
		
		System.out.println(smallestDiff(a,b));
	}
	
}
