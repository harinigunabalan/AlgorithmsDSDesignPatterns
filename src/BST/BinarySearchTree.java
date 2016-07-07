package BST;

public class BinarySearchTree {
	
	public static void inOrderTraversal(TreeNode node){
		if(node == null)
			return;
		if (node != null){
			inOrderTraversal(node.left);
			System.out.println(node.value + ", ");
			inOrderTraversal(node.right);
		}
	}
	
	public static void preOrderTraversal(TreeNode node){
		if(node == null)
			return;
		if(node != null){
			System.out.println(node.value + ", ");
			preOrderTraversal(node.left);
			preOrderTraversal(node.right);
		}
	}

	public static void postOrderTraversal(TreeNode node){
		if(node == null)
			return;
		if(node != null){
			postOrderTraversal(node.left);
			postOrderTraversal(node.right);
			System.out.println(node.value + ", ");
		}
	}
	
	public void addNode(TreeNode root, TreeNode node){
		
		if(root == null)
			node = root;
		else{
				if (node.value < root.value){
					if(root.left != null)
						addNode(root.left, node);
					else
						root.left = node;
				}	
				else{ 
					if(root.right != null)
						addNode(root.right, node);
					else
						root.right = node;
				}	
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(50);
		TreeNode node1 = new TreeNode(75);
		TreeNode node2 = new TreeNode(25);
		TreeNode node3 = new TreeNode(31);
		TreeNode node4 = new TreeNode(7);
		TreeNode node5 = new TreeNode(100);
		TreeNode node6 = new TreeNode(60);
		TreeNode node7 = new TreeNode(33);
		
		BinarySearchTree bst = new BinarySearchTree();
		bst.addNode(null, root);
		bst.addNode(root, node1);
		bst.addNode(root, node2);
		bst.addNode(root, node3);
		bst.addNode(root, node4);
		bst.addNode(root, node5);
		bst.addNode(root, node6);
		bst.addNode(root, node7);
		
		System.out.println("In Order Traversal:");
		inOrderTraversal(root);
		System.out.println("Pre Order Traversal:");
		preOrderTraversal(root);
		System.out.println("Post Order Traversal:");
		postOrderTraversal(root);
	}

}
