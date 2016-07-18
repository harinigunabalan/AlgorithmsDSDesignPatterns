package StringManipulation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

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
		
	}
	
}
