package ctci;

public class LinkedListOperations {
	
	static LinkedListNode head;
	static LinkedListNode tail;
	
	public void setTail(){
		while(tail.next != null){
			tail = tail.next;
		}
	}

	public LinkedListNode addNode(int n){
		if(head == null && tail == null){
			head = new LinkedListNode(n);
			tail = head;
		}
		else{
			tail.next = new LinkedListNode(n);
			tail = tail.next;
		}
		return head;
	}
	
	public void PrintLL(){
		LinkedListNode temp = new LinkedListNode();
		temp = head;
		while(temp != null){
			System.out.print(temp.val + " -> ");
			temp = temp.next;
		}
	}
	
	public LinkedListNode LLReversal(){
		
		
		LinkedListNode curr = head;
		LinkedListNode prev = null, next = null;
		while(curr != null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
		return head;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListOperations llo = new LinkedListOperations();
		llo.addNode(1);
		llo.addNode(5);
		llo.addNode(3);
		llo.addNode(7);
		llo.addNode(67);
		llo.addNode(234);
		llo.addNode(89);
		
		llo.PrintLL();
		llo.LLReversal();
		System.out.println("null");
		llo.PrintLL();
	}

}
