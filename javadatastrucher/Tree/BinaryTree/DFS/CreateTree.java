// Create a Binary Tree 
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

	public static void main(String args[]) {
		
		Node root=null;
		
		BinaryTree Bt=new BinaryTree();
		root=Bt.createTree();

		System.out.println(root.data);
		System.out.println(root.left.data);
		System.out.println(root.right.data);

	}
}

