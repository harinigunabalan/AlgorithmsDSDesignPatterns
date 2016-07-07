package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
	
	public int lengthOfLongestSubstring1(String s) {
       /* int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        System.out.println(ans);
        return ans;*/
		
		Set<Character> charSet = new HashSet<Character>();
		int i = 0, j = 0, max_length = 0;
		
		while(!(i >= s.length() || j >= s.length())){
		    if (!charSet.contains(s.charAt(j))){
		        charSet.add(s.charAt(j));
		        j++;
		        max_length = Math.max(max_length , j - i);
		    }
		    else{
		        charSet.remove(s.charAt(i));
		        i++;
		    }
		}
		
		System.out.println(max_length);
		return max_length;
		
	}
	
	public static void main(String[] args){
		LongestSubString lsub = new LongestSubString();
		lsub.lengthOfLongestSubstring1("iqwertzupoi");
	}
	
}
