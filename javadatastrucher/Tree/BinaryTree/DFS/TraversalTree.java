// Create a Binary Tree And Traversal it 
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

class BinaryTree{
	
	Scanner sc=new Scanner(System.in);
	// this method create a Tree 
	Node createTree(){
		System.out.println("Enter the data : ");
		int data=sc.nextInt();

		Node newNode=new Node(data);
		
		System.out.println("Do you want to add at left of "+ newNode.data);
		char leftNode=sc.next().charAt(0);

		if(leftNode=='y'||leftNode=='Y'){
			newNode.left=createTree();
		}

		System.out.println("Do you want to add at right of "+ newNode.data);
		char rightNode=sc.next().charAt(0);

		if(rightNode=='y'||rightNode=='Y'){
			newNode.right=createTree();
		}

		return newNode;

	}
	// this method traversal the tree in preOrder Traversal ==> [ data - left - right ]
	void preOrder(Node root){
		
		if(root==null){
			return;
		}

		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	// this method traversal the tree in inOrder Traversal ==> [ left - data - right ]
	void inOrder(Node root){
		
		if(root==null){
			return;
		}

		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	// this method traversal the tree in postOrder Traversal ==> [  left - right - data ]
	void postOrder(Node root) {
		
		if(root==null){
			return;
		}

		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
	}
	public static void main(String args[]) {
		
		Node root=null; // this take for show ref to root
		
		BinaryTree Bt=new BinaryTree();
		root=Bt.createTree();

		// Call the preOrder Method
		 System.out.print("PreOrder :");
		Bt.preOrder(root);
		System.out.println();

		// call  the inOrder Method
		System.out.print("InOrder :");
		Bt.inOrder(root);
		System.out.println();

		// call  the postOrder Method
		System.out.print("PostOrder :");
                Bt.postOrder(root);
                System.out.println();

	}
}

