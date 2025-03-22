// Construct BinaryTree Using PreOrder Array

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
	Node ConstructTree(int Nodes[]){
		index++;
		if(Nodes[index]==-1){
			return null;
		}

		Node newNode = new Node(Nodes[index]);
		newNode.left=ConstructTree(Nodes);
		newNode.right=ConstructTree(Nodes);

		return newNode;
		
	}


	void preOrder(Node root){
		
		if(root==null) {
			return;
		}

		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);

	}

	public static void main(String args[] ) {
			
		Node root = null;

		int Nodes[] = new int[]{1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

		BinaryTree Bt = new BinaryTree();

		root = Bt.ConstructTree(Nodes);

		Bt.preOrder(root);
		System.out.println();


	}
}
