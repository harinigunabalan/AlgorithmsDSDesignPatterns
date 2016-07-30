package LeetCode;

public class LLOperations {

	ListNode head = null;
	
	public ListNode addNode(ListNode node){
		if(node != null){
			if(head == null){
				head = node;
			}else{
				ListNode curr = head;
				while(curr.next != null){
					curr = curr.next;
				}
				curr.next = node;
			}
		}
		return head;
	}
	
	public ListNode reversal(){
		ListNode curr = head, prev = null, next;
		while(curr != null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
		return head;
	}
	
	public static void main(String[] args){
		
		LLOperations llo = new LLOperations();
		
		for(int i = 0; i < 8; i++){
			ListNode node = new ListNode(i+28);
			llo.addNode(node);
		}
		
		ListNode traverse = llo.head;
		while(traverse != null){
			System.out.print(traverse.val + "->");
			traverse = traverse.next;
		}
		
		llo.head = llo.reversal();
		traverse = llo.head;
		while(traverse != null){
			System.out.print(traverse.val + "->");
			traverse = traverse.next;
		}
	}
	
}
