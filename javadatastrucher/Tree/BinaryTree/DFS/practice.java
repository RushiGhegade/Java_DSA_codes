// DFS And BFS Traversal

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
	Node constructBt(int arr[]) {
		index++;
		if(arr[index]==-1){
			return null;
		}

		Node newNode = new Node(arr[index]);
		newNode.left = constructBt(arr);
		newNode.right= constructBt(arr);

		return newNode;

	}
	
	void preOrder(Node root) {
		
		if(root==null){
			return;
		}

		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}

	void levelOrder(Node root) {
		if(root==null){
			return ;
		}

		Queue<Node> que = new LinkedList<>();

		que.add(root);
		que.add(null);

		while(!que.isEmpty()){
			
			Node temp = que.remove();

			if(temp==null){
				
				if(!que.isEmpty()){
					que.add(null);
					System.out.println();
				}

			}else{
				
				System.out.print(temp.data+" ");

				if(temp.left!=null) {
					que.add(temp.left);
				}

				if(temp.right!=null){
					que.add(temp.right);
				}

			}
		}
	}
	int heightOfBinaryTree(Node root) {
		
		if(root==null){
			return 0;
		}

		int left=heightOfBinaryTree(root.left);
		int right= heightOfBinaryTree(root.right);

		return Integer.max(left,right)+1;
	}

	int countOfNodes(Node root) {
		
		if(root==null){
			return 0;
		}

		int left = countOfNodes(root.left);
		int right = countOfNodes(root.right);

		return left+right+1;
	}

	int SumOfNodes(Node root) {
		
		if(root==null) {
			return 0;
		}

		int left=SumOfNodes(root.left);
		int right= SumOfNodes(root.right);

		return left+right+root.data;
	}

	public static void main(String args[]) {
		
		Node root = null;

		int arr[]=new int[]{1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,8,-1,-1,-1};

		BinaryTree Bt = new BinaryTree();
		root = Bt.constructBt(arr);

		// DFS Search
		Bt.preOrder(root);
		System.out.println();

		//Bfs Search
		Bt.levelOrder(root);
		System.out.println();
		
		// Height of BinaryTree
		int height = Bt.heightOfBinaryTree(root);
		System.out.println("Height :"+height);

		// CountNode 
		int count = Bt.countOfNodes(root);
		System.out.println("Count of Nodes :"+count);

		// Sum of Nodes
		int sum = Bt.SumOfNodes(root);
		System.out.println("Sum of Nodes :"+sum);
	}
}

