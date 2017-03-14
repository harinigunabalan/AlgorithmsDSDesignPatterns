package BST;

public class BSTFromSortedArray {

	public static TreeNode buildBST(int[] a){
		TreeNode node = new TreeNode(0);
		if(a.length > 1){
			node.value = a[a.length/2];
			int left[] = new int[a.length/2], right[] = new int[a.length - a.length/2 - 1];
			for(int i= 0; i < a.length; i++){
				if(i < a.length/2){
					left[i] = a[i];
				}else if(i > a.length/2){
					right[i - a.length/2 -1] = a[i];
				}
			}			
			node.left = buildBST(left);
			node.right = buildBST(right);
		} else if( a.length == 1){
			node.value = a[0];
			node.left = null;
			node.right = null;
		} else{
			node = null;
		}
		
		return node;
	}
	
	public static void main(String[] args){
		int[] a = {1,2,3,4,5,6,7,};
		TreeNode root = buildBST(a);
		BinarySearchTree.inOrderTraversal(root);
		BinarySearchTree.preOrderTraversal(root);
		BinarySearchTree.postOrderTraversal(root);
	}
	
}
