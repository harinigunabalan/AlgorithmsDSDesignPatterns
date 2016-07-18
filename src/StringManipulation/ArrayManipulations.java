package StringManipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;

public class ArrayManipulations {
	
	public static ArrayList<Integer> removeDuplicatesFirstIndex(ArrayList<Integer> l1){
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		set.addAll(l1);
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.addAll(set);
		return al;
	}

	public static ArrayList<Integer> removeDuplicatesLastIndexSol1(ArrayList<Integer> l1){
		long start = System.nanoTime();
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for(int i = 0; i < l1.size(); i++){
			if(set.contains(l1.get(i))){
				set.remove(l1.get(i));
			}	
			set.add(l1.get(i));
		}
		
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.addAll(set);
		long end = System.nanoTime();;
		System.out.println(end - start);
		return al;
		
	}
	
	public static ArrayList<Integer> removeDuplicatesLastIndexSol2(ArrayList<Integer> l1){
		long start = System.nanoTime();
		HashMap<Integer, Integer> lastIndexMap = new HashMap<Integer, Integer>();
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i = 0; i < l1.size(); i++){
				lastIndexMap.put(l1.get(i), i);
		}
		
		for(int i = 0; i < l1.size(); i++){
			if(lastIndexMap.get(l1.get(i)) == i){
				al.add(l1.get(i));
			}
		}

		long end = System.nanoTime();
		System.out.println(end - start);
		return al;
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	

		int[] test = {1,2,3,5,6,9,3,6,8,9,2,3,0,5};
		Arrays.sort(test);
		for(int i = 0; i< test.length; i++){
			System.out.print(test[i] + " ");
		}
		
		System.out.println("----------------");
		
		ArrayList<Integer> l1 = new ArrayList<Integer>(32);
		System.out.println(l1.hashCode());
		System.out.println(l1.size());
		l1.add(5);
		System.out.println(l1.size());
		l1.add(4);
		System.out.println(l1.size());
		l1.add(3);
		System.out.println(l1.size());
		l1.add(2);
		System.out.println(l1.size());
		l1.add(1);
		System.out.println(l1.size());
		l1.add(1);
		l1.add(2);
		System.out.println(l1.hashCode());
		ArrayList<Integer> al = removeDuplicatesFirstIndex(l1);
		System.out.println(al);
		ArrayList<Integer> al1 = removeDuplicatesLastIndexSol1(l1);
		System.out.println(al1);
		ArrayList<Integer> al2 = removeDuplicatesLastIndexSol2(l1);
		System.out.println(al2);
	}

}
