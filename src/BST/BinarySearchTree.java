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
			root = node;
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

	public void addNode(TreeNode root, int n){

		if(root == null){
			TreeNode newNode = new TreeNode(n);
			root = newNode;
		}else{
			if(n > root.value)
				if(root.right != null)
					addNode(root.right, n);
				else{
					TreeNode newNode = new TreeNode(n);
					root.right = newNode;
				}

			else
			if(root.left != null)
				addNode(root.left, n);
			else{
				TreeNode newNode = new TreeNode(n);
				root.left = newNode;
			}


		}
	}

	public boolean search(TreeNode root, int n){
		if(root == null)
			return false;
		else{
			if(root.value == n)
				return true;
			else if(root.value < n)
				return (search(root.right, n));
			else
				return(search(root.left, n));
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

		System.out.println(bst.search(root, 60));
		System.out.println(bst.search(root, 50));
		System.out.println(bst.search(root, 100));
		System.out.println(bst.search(root, 33));
		System.out.println(bst.search(root, 7));
		System.out.println(bst.search(root, 25));
		System.out.println(bst.search(root, 31));
		System.out.println(bst.search(root, 75));
		System.out.println(bst.search(root, 18));
		System.out.println(bst.search(root, 17));

		TreeNode root2 = new TreeNode(50);
		bst.addNode(root2, 75);
		bst.addNode(root2, 25);
		bst.addNode(root2, 31);
		bst.addNode(root2, 7);
		bst.addNode(root2, 100);
		bst.addNode(root2, 60);
		bst.addNode(root2, 33);
		// bst.addNode2(root, 75);

		System.out.println("In Order Traversal:");
		inOrderTraversal(root2);
		System.out.println("Pre Order Traversal:");
		preOrderTraversal(root2);
		System.out.println("Post Order Traversal:");
		postOrderTraversal(root2);
	}

}
