import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionsForEach {

	
	public static void main(String[] args){
		List<String> names = new ArrayList<String>();
		List<String> subjects = new ArrayList<String>();
		
		String name = "Harini";	
		names.add(name);
		name = "Hari";
		names.add(name);
		
		subjects.add("Big Data");
		subjects.add("Distributed systems");
		subjects.add("Event Processing");
		subjects.add("SEDC");
		
/*		for(String n : names){
			for(String s : subjects){
				System.out.println(n + s);
			}
		}*/
		
		for(Iterator i1 = names.iterator(); i1.hasNext();){
			String nameNew = (String) i1.next();
		
			for(Iterator i2 = subjects.iterator(); i2.hasNext();){
				System.out.println(nameNew + i2.next());
				
				
			}
		}
		
		double d1 = Math.random();
		
		System.out.println(d1);
		
	}
	
}
