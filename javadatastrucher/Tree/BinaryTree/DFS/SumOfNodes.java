// Contruct the Binary tree 

class Node {
	
	int data ;
	Node left;
	Node right;

	Node(int data) {
		this.data=data;
		left=right=null;
	}
}

class BinaryTree {
	// Construct the preOrder Tree
	int index=-1;
	Node constructBt(int arr[]) {
		index++;
		if(arr[index]==-1) {
			return null;
		}

		Node newNode = new Node(arr[index]);
		newNode.left = constructBt(arr);
		newNode.right = constructBt(arr);

		return newNode;
	}
	// print the preOrder
	void preOrder(Node root) {
		
		if(root==null) {
			return ;
		}

		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	//Count the Nodes
	int countNodes(Node root) {
		
		if(root==null){
			return 0;
		}

		int left = countNodes(root.left);
		int right = countNodes(root.right);

		return left+right+1;
	}

	// Sum of the Nodes
	int sumOfNodes(Node root) {
		
		if(root==null){
			return 0;
		}

		int left = sumOfNodes(root.left);
		int right = sumOfNodes(root.right);

		return left+right+root.data;
	}
	public static void main(String args[]) {
		
		Node root = null;
		
		int arr[]=new int[]{1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

		BinaryTree Bt = new BinaryTree();

		// Construct the Binary tree
		root=Bt.constructBt(arr);

		// Print In PreOrder
		Bt.preOrder(root);
		System.out.println();

		// Count the Nodes 
		int count=Bt.countNodes(root);
		System.out.println(count);
		
		// Sum of the Nodes
		int sum=Bt.sumOfNodes(root);
		System.out.println(sum);
	}
}
