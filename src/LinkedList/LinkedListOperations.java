package LinkedList;

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

	public void rotate(int k){
		int length = 0;
		LinkedListNode curr = head;
		LinkedListNode prev = null;
		LinkedListNode newHead = null;

		while(curr != null){
			length++;
			curr = curr.next;
		}
		if(k > length)
			return;
		curr = head;

		while(k>0){
			prev = curr;
			curr = curr.next;
			k--;
		}
		newHead = curr;
		while(curr.next != null)
			curr = curr.next;
		prev.next = null;
		curr.next = head;
		head = newHead;
		tail = prev;
	}

	public LinkedListNode isCircular(){
		LinkedListNode node = null;
		LinkedListNode fast = head;
		LinkedListNode slow = head;
		int k = 0;
		while(fast != null && fast.next.next != null){
			slow = slow.next;
			fast = fast.next.next;
			if(fast == slow){
				// colision
				break;
			}
		}

		fast = head;
		while (slow != fast){
			fast = fast.next;
			slow = slow.next;
		}

		return slow;
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
		System.out.println("------REVERSE------");
		llo.PrintLL();
		System.out.println();
		System.out.println("------ROTATE------");
		llo.rotate(3);
		llo.PrintLL();
	}

}
