package LinkedList;

public class LLIntersection {
	
	public LinkedListNode isIntersecting(LinkedListNode l1, LinkedListNode l2){
		
		LinkedListNode p1 = l1;
		LinkedListNode p2 = l2;
		
		
		if(p1 == null || p2 == null)
			return null;
		
		int length1 = 1, length2 = 1, counter = 0;
		
		while(p1.next != null){
			p1 = p1.next;
			length1++;
		}
		while(p2.next != null){
			p2 = p2.next;
			length2++;
		}
		if(p1 != p2)
			return null; // no intersection
		else{
			p1 = l1;
			p2 = l2;
			// return intersecting node
			if(length1 > length2){
				counter = length1 - length2;
				while(counter > 0){
					p1 = p1.next;
					counter--;
				}
			} else if (length2 > length1){
				counter = length2 - length1;
				while(counter > 0){
					p2 = p2.next;
					counter--;
				}
			}
			while(p1 != p2){
				p1 = p1.next;
				p2 = p2.next;
			}
			return p1;
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListNode l1 = new LinkedListNode(3);
		l1.next = new LinkedListNode(1);
		l1.next.next = new LinkedListNode(5);
		l1.next.next.next = new LinkedListNode(9);
		l1.next.next.next.next = new LinkedListNode(7);
		l1.next.next.next.next.next = new LinkedListNode(2);
		l1.next.next.next.next.next.next = new LinkedListNode(1);
		
		LinkedListNode l2 =  new LinkedListNode(4);
		l2.next = new LinkedListNode(6);
		l2.next.next = l1.next.next.next.next;
		
		LLIntersection intersection = new LLIntersection();
		LinkedListNode result = intersection.isIntersecting(l1, l2);
		System.out.println(result.val);
		System.out.println(result.next.val);
		System.out.println(result.next.next.val);
		
		
	}

}
