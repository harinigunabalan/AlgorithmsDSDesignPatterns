package LeetCode;

public class LLsumOfDigits {

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int carryOver = 0;
		ListNode result = null;

		while (l1 != null || l2 != null || carryOver == 1) {

			ListNode node = new ListNode(0);

			int expr;
			if (l1 != null && l2 != null)
				expr = l1.val + l2.val + carryOver;
			else if (l1 != null && l2 == null)
				expr = l1.val + carryOver;
			else if (l2 != null && l1 == null)
				expr = l2.val + carryOver;
			else
				expr = carryOver;

			if (expr < 10) {
				node.val = expr;
				carryOver = 0;
			} else {
				node.val = (expr) % 10;
				carryOver = 1;
			}
			if(l1 != null)
				l1 = l1.next;
			if(l2 != null)
				l2 = l2.next;
			result = addNodeToResult(result, node);
		}
		return result;
	}

	public static void printLL(ListNode l) {
		while (l != null) {
			System.out.print(l.val + "->");
			l = l.next;
		}
		System.out.println();
	}

	public static ListNode addNodeToResult(ListNode header, ListNode node) {

		ListNode temp = header;

		if (header == null) {
			header = node;
			return header;
		}
		while (header.next != null) {
			header = header.next;
		}
		header.next = node;
		return temp;
	}

	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(9);

		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);

		printLL(l1);
		printLL(l2);

		ListNode result = addTwoNumbers(l1, l2);
		printLL(result);

	}
}
