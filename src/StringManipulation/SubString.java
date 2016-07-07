package StringManipulation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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
		
	}
	
}
