package StringManipulation;

public class ContinuousSumArray {

	public static int LargestSum(int[] array){
		int bigSum = 0;
		int tempSum = 0;
		for(int i = 0; i<array.length; i++){
			tempSum += array[i];
			bigSum = Math.max(bigSum, tempSum);
			if(tempSum < 0){
				tempSum = 0;
			}
		}
		
		return bigSum;
	}
	
	public static void main(String[] args){
		int[] array = { 12, 34, 76, -45, 56, 1000, -45};
		int result = LargestSum(array);
		System.out.println(result);
	}
	
}
