import java.util.HashMap;

public class HashMapImplementation {

	static HashMap<String, String> hm1 = new HashMap<String, String>();


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("A1", "Distributed Software Systems");
		hm.put("A2", "Distributed Software Systems");
		
		hm1.put("A1", "Distributed Software Systems");
		hm1.put("A2", "Distributed Software Systems");
		
		System.out.println(hm.hashCode());
	}

}
