import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapImplementation {

	static HashMap<String, String> hm = new HashMap<String, String>();


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("A1", "Distributed Software Systems");
		hm.put("A2", "Distributed Software Systems");
		
		HashMapImplementation.hm.put("A1", "Distributed Software Systems");
		hm.put("A3", "Distributed Software Systems");
		
		System.out.println(hm.hashCode());
		System.out.println(hm.entrySet());

		
// Different ways of Iterating through a hashmap		
		Iterator it = hm.entrySet().iterator();		// EntrySet 
		
	
		for(;it.hasNext();){
			Map.Entry<String, String> current = (Map.Entry<String, String>)it.next();
			System.out.println(current);
		}
		
		for(Map.Entry<String, String> entry : hm.entrySet()){
			String key = entry.getKey();
			System.out.println(key);
			String value = entry.getValue();
			System.out.println(value);
		}
		
		Iterator it1 = hm.keySet().iterator(); 	// Key set
		
		for(;it1.hasNext();){
			String current = (String)it1.next();
			System.out.println(current);
		}
		
	}

}
