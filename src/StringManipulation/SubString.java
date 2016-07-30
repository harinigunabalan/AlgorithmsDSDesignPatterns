package StringManipulation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class SubString {

	public static void permutation(String str){
		permutation(str, "");
	}
	
	public static void permutation(String str, String prefix){
		if(str.length() == 0)
			System.out.println(prefix);
		else{
			for(int i=0; i < str.length(); i++){
				String rem = str.substring(0, i) + str.substring(i+1);
				permutation(rem, prefix + str.charAt(i));
			}
		}
	}
	
	public static int atoi(String input){
		if(input == null || input.length() < 1){
			return 0;
		}
		int result = 0;
		for(int i = 0; i < input.length(); i++){
			char curr = input.charAt(i);
			result += (curr - '0') * Math.pow(10, (input.length() - i -1));
		}
		return result;
			
	}
	
	public static String reverse(String input){
		char[] str = input.toCharArray();
		for(int i = 0; i < str.length/2; i++){
			char temp = str[i];
			str[i] = str[str.length -1 - i];
			str[str.length -1 -i] = temp;
		}
		
		return new String(str);
	}
	
	public static String runLengthEncoding(String input){
		
		//char[] result = new char[input.length()];
		ArrayList<Character> result = new ArrayList<Character>();
		char[] inp = input.toCharArray();
		int currCharCount = 1;
		char curr, prev = '\0';
		int j = 0;
		for(int i =0; i < inp.length; i++){
			curr = inp[i];
			if(curr == prev){	
				currCharCount++;
			}
			if((curr != prev && prev != '\0') || i == inp.length -1){		
				if(j >= input.length()){
					return input;
				}
				result.add(prev);  j++;
				if(j >= input.length()){
					return input;
				}
				char count = (char) (currCharCount + '0');
				result.add(count); j++;
				
				currCharCount = 1;
			}
			prev = curr;
		}
		String resultStr = result.toString();
		
		return resultStr;
	}
	
	public static HashSet<String> getPermutation(String str){
		  HashSet<String> permutations = new LinkedHashSet<String>();		
		if(str == null){
			return null;
		}
		
		if (str.length() == 0){
			permutations.add("");
			return permutations;
		}

			char first = str.charAt(0);
			String remainder = str.substring(1);
			for(String word: getPermutation(remainder)){
				for(int i = 0; i <= word.length();i++){
					String perm = word.substring(0, i)+ first + word.substring(i);
					permutations.add(perm);
				}
			}
			return permutations;
			
	}
	
	public static void main(String[] args){
	
		String name = "test";
		System.out.println(String.format("%f", 255.0));
		permutation(name);
		
		String file = "/url";
		try {
			BufferedReader buff = new BufferedReader(new FileReader(file));
			String temp = null;
			while((temp = buff.readLine()) != null)
				System.out.println(temp);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException io){
			io.printStackTrace();
		}
		
		int result = atoi("1234");
		System.out.println(result);
		
		char[] seq = { 'a', 'b', 'c', 'd'};
		char[] seqStr = Arrays.copyOf(seq, seq.length);
		
		String abc = "hello here! ";
		System.out.println(abc.substring(3));
		System.out.println(abc.substring(0, 3));
		
		String comma_sep = "Hello, world, harini, here";
		System.out.println("-----------------------------");
		System.out.println(comma_sep.chars());
		
		String s1 = "hello";
		StringBuilder s2 = new StringBuilder("hello");
		StringBuffer s3 = new StringBuffer("hello");
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s1));
		
		System.out.println(reverse("harini"));
		System.out.println(reverse("hariharan"));
		System.out.println(reverse("I am from India"));
		System.out.println(reverse("Bubyeee"));
		
		String rlc = runLengthEncoding("lllllllliiiiiiooooo");
		System.out.println(rlc);
		
		String test = "harinI";
		System.out.println(getPermutation(test));
		System.out.println(getPermutation(test).size());
		
		
	}
	
}
