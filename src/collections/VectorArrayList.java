package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class VectorArrayList {
	
	
	public void vectorManipulation(){
		Vector v1 = new Vector(3,2);
		
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		v1.addElement(new Integer(1));
		v1.addElement(new Double(2));
		v1.addElement(new Double(3));
		v1.addElement(new Double(4));
		v1.addElement(new Double(5));
		v1.addElement(new Double(6));
		v1.addElement(new Integer(7));
		v1.addElement(new Integer(8));
		
		Iterator<Object> i = v1.iterator();
		
		for(; i.hasNext();){
			System.out.println(i.next());
		}
	}
	
	public void arrayListLinkedList(){
		ArrayList al = new ArrayList();
		LinkedList ll = new LinkedList();
		
		// Adding to Array List
		
		long start = System.nanoTime();
		for(int i =0; i < 2147483647; i++){
			al.add(i);
		}
		long end = System.nanoTime();
		long diff = end - start;
		System.out.println("Time to add to AL: " + diff);
		
		// Adding to Linked List
		
		start = System.nanoTime();
		for(int i = 0; i < 2147483647; i++){
			ll.add(i);
		}
		end = System.nanoTime();
		diff = end - start;
		System.out.println("Time to add to LL: " + diff);
		
		// Getting from ArrayList
		
		start = System.nanoTime();
		for(int i = 0; i < 2147483647; i++){
			al.get(i);
		}
		end = System.nanoTime();
		diff = end - start; 
		System.out.println("Time to get from AL:" + diff);
		
		
		// Getting from LinkedList
		
		start = System.nanoTime();
		for(int i = 0; i < 2147483647; i++){
			ll.get(i);
		}
		end = System.nanoTime();
		diff = end - start; 
		System.out.println("Time to get from LL:" + diff);
				
		// Removing from ArrayList	
		
		start = System.nanoTime();
		for(int i = 2147483646; i <= 0; i++){
			al.remove(i);
		}
		end = System.nanoTime();
		diff = end - start;
		System.out.println("Time to remove from AL:" + diff);
		
	// Removing from LinkedList	
		
		start = System.nanoTime();
		for(int i = 2147483646; i <= 0; i++){
			ll.remove(i);
		}
		end = System.nanoTime();
		diff = end - start;
		System.out.println("Time to remove from LL:" + diff);
		
	}

	public static void main(String[] args){
		
		VectorArrayList VAL = new VectorArrayList();
		VAL.vectorManipulation();
		// VAL.arrayListLinkedList();
		
	}
	
}
