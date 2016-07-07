package ctci;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SubBaseClass {

	
	List<Integer> list1 = new ArrayList<Integer>();
	LinkedList<Integer> list2 = new LinkedList<Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	SubBaseClass temp = new SubBaseClass();
	
	temp.list1.add(1);
	temp.list1.add(2);
	temp.list1.add(3);
	temp.list1.add(4);
	temp.list1.add(5);
	
	temp.list2.add(5);
	temp.list2.add(4);
	temp.list2.add(3);
	temp.list2.add(2);
	temp.list2.add(1);
	
	System.out.println(temp.list2.get(0));
	System.out.println(temp.list1.get(0));

	
	}
	

}
