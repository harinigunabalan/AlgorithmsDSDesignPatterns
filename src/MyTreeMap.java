import java.util.NavigableMap;
import java.util.TreeMap;

public class MyTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 NavigableMap<Integer,String> map =
			        new TreeMap<Integer, String>();		// Navigable map is interface and TreeMAp is the Implementation

			    map.put(0, "Kid");
			    map.put(11, "Teens");
			    map.put(20, "Twenties");
			    map.put(30, "Thirties");
			    map.put(40, "Forties");
			    map.put(50, "Senior");
			    map.put(100, "OMG OMG OMG!");

			    
			    System.out.println(map.get(map.floorKey(13)));     // Teens
			    System.out.println(map.get(map.floorKey(29)));     // Twenties
			    System.out.println(map.get(map.floorKey(30)));     // Thirties
			    System.out.println(map.floorEntry(42).getValue()); // Forties
			    System.out.println(map.get(map.floorKey(666)));    // OMG OMG OMG!
			    
			    System.out.println(map.floorEntry(13));
		
	}

}
