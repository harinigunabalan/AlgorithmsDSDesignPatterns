import java.util.HashMap;

public class HashMapImplementation {

	static HashMap<String, String> hm1 = new HashMap<String, String>();


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("Harini", "Distributed Software Systems");
		hm.put("Hari", "Distributed Software Systems");
		
		hm1.put("Harini", "Distributed Software Systems");
		hm1.put("Hari", "Distributed Software Systems");
		
		System.out.println(hm.hashCode());
	}

}
