// print the level Order in tree 
// 1st Approch print all in one line 
import java.util.*;

class Node {
	int data;
	Node left;
	Node right;

	Node(int data) {
		this.data=data;
		left=right=null;
	}
}

class BinaryTree {
	int index=-1;
	Node constructTree(int arr[]) {
		index++;

		if(arr[index]==-1){
			return null;
		}

		Node newNode = new  Node(arr[index]);
		newNode.left=constructTree(arr);
		newNode.right=constructTree(arr);

		return newNode;
		
	}
	// 1st Approch print all level order traversal in one line
	void levelOrderPrint(Node root) {

		if(root==null){
			return ;
		}	

		Queue<Node> que = new LinkedList<>();	

		que.add(root);

		while(!que.isEmpty()){
			
			Node temp = que.remove();

			System.out.print(temp.data+" ");

			if(temp.left!=null){
				que.add(temp.left);
			}

			if(temp.right!=null){
				que.add(temp.right);
			}
		}
	}
	public static void main(String args[]) {
		
		Node root = null;

		int arr[] = new int[]{1,2,4,-1,-1,5,-1,-1,3,-1,6,7,-1,-1,-1};

		BinaryTree Bt = new BinaryTree();

		// Construct the Tree
		root = Bt.constructTree(arr);
		
		//Print the Level order 	
		Bt.levelOrderPrint(root);
		System.out.println();

	}

}
