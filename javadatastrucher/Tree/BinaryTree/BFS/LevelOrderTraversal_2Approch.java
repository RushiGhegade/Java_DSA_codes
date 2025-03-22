// print the level Order in tree 
// 2st Approch print all Node in its Proper levelwise 
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
	// 2st Approch print all level order traversal in proper levelWise
	void levelOrderPrint(Node root) {

		if(root==null){
			return ;
		}	
		
		Queue<Node> que = new LinkedList<>();

		que.add(root);
		que.add(null);

		while(!que.isEmpty()){
			
			Node temp = que.remove();

			if(temp!=null){
				System.out.print(temp.data+" ");

				if(temp.left!=null){
					que.add(temp.left);
				}

				if(temp.right!=null){
					que.add(temp.right);
				}
			}else{
				if(!que.isEmpty()){
					que.add(null);
					System.out.println();
				}
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
