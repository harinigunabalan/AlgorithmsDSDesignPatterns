package LeetCode;

import java.util.HashMap;

public class TwoSum {
	
	public static void main(String[] args){
		TwoSum twosum = new TwoSum();
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] result = twosum.twoSum(nums, 25);
		if(result != null){
			System.out.println(result[0]);
			System.out.println(result[1]);
		} else {
			System.out.println("No matching results");
		}
	}
	
	public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            int key = target - nums[i];
            if(map.containsKey(key))
            	return new int[]{map.get(key), i};
            else
                map.put(nums[i],i); 
        }
        return null;
    }
	
}
