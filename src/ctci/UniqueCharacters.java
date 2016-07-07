package ctci;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class UniqueCharacters {

	public static void main(String[] args){
		UniqueCharacters uc = new UniqueCharacters();
		boolean result = uc.efficientCheckUniqueCharacters("1234567890qwertzuiokjhgfdsa");
		if(result == true)
			System.out.println("Unique Characters");
		else
			System.out.println("Repeated Characters");
	}
	
	Set<Integer> set = new HashSet<Integer>();
	public boolean checkUniqueCharacters(String input){
		
		for(int i = 0; i < input.length(); i++){
			Integer ascii = Integer.valueOf(input.charAt(i));
			boolean result = set.add(ascii);
			if(result == false)
				return false;
		}
		return true;
	}
	
	public boolean efficientCheckUniqueCharacters(String input){
		boolean[] alphabet_bit = new boolean[128];
		for(int i = 0; i < input.length(); i++){
			int index = input.charAt(i);
			if(alphabet_bit[index] == true)
				return false;
			else
				alphabet_bit[index] = true;
		}
		return true;
	}
	
}
