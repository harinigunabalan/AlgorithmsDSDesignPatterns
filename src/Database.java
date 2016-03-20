import java.util.ArrayList;
import java.util.Collection;

public class Database
{
	public static int c1[] = {-3,2,0,7,4,3,2,1,100,16,1,0,-13,6,2,3};
	public static String c2[] = {"a","b","sunday","sunday","sunday","sunday","sunday","sunday","b","sunday","ahgijfdo","","sunday","","abc","monday"};
	
	public static void main(String[] args){
		// return result of SQL query
		// select avg(c1*c1) from tab where c2='sunday'
		
		int counter = 0;
		int sum = 0;
		
		for (int i =0; i < c2.length; i++){
			if(c2[i].equalsIgnoreCase("sunday")) 
				{
					sum += (c1[i] * c1[i]);
					counter++;
				}
		}
		
		System.out.println("Average: " + sum/counter);
		
		
	}
	
	//square
	//average method
}
