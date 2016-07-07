package ctci;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Lambda {
	
	List<Integer> getRandomSubset(List<Integer> list){
		
		Random random = new Random();
		Predicate<Object> p =  k -> { return random.nextBoolean();
		};
		return list.stream().filter(p).collect(Collectors.toList());
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList();
		list.add(54);
		list.add(543);
		list.add(455);
		list.add(321);
		list.add(876);
		list.add(456);
		list.add(324);
		
		
	}

}
