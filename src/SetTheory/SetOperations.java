package SetTheory;

import java.util.HashSet;
import java.util.Iterator;

public class SetOperations {

	public static HashSet<HashSet<Integer>> powerSet(HashSet<Integer> set1){
		
		HashSet<HashSet<Integer>> result = new HashSet<HashSet<Integer>>();
		
		if(set1.isEmpty()){
			HashSet<Integer> empty = new HashSet<Integer>();
			result.add(empty);
			return result;
		}
		for(Iterator itr = set1.iterator(); itr.hasNext();){
			Integer i = (Integer) itr.next();
			HashSet<Integer> remaining = new HashSet<Integer>();
			itr.remove();
			remaining.addAll(set1);
			HashSet<HashSet<Integer>> tempResult = powerSet(remaining);
			// add integer i to every set in result
		
			for(HashSet<Integer> innerSet : tempResult){
				HashSet<Integer> newCorresSet = new HashSet<Integer>();
				newCorresSet.addAll(innerSet);
				newCorresSet.add(i);
				result.add(innerSet);
				result.add(newCorresSet);	
			}
		}
		return result;
	}
	
	public static HashSet<Integer> setDiffernce(HashSet<Integer> set1, HashSet<Integer> set2){
		HashSet<Integer> result = new HashSet<Integer>();
		Iterator itr = set1.iterator();
		for(;itr.hasNext();){
			Integer current = (Integer)itr.next();
			if(!set2.contains(current))
				result.add(current);		
		}
		return result;
	}
	
	public static void main(String[] args){
		HashSet<Integer> set1 = new HashSet<Integer>();
		HashSet<Integer> set2 = new HashSet<Integer>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		set1.add(6);
		
		 set2.add(12);
		 set2.add(6);
		 set2.add(3);
		 set2.add(9);
		
		HashSet<Integer> result = setDiffernce(set2 , set1);
		for(Integer integer : result)
			System.out.println(integer);
		
		HashSet<HashSet<Integer>> powerset = powerSet(set2);
		System.out.println(powerset);
		
	}
	
}
