class Node{
	int data;
	Node next=null;

	Node(int data){
		this.data=data;
	}
}
class LinkedList{
	Node Head=null;

	void addFirst(int data){
		Node newnode =new Node(data);
		if(Head==null){
			Head=newnode;
		}else{
			newnode.next=Head;
			Head=newnode;
		}
	}
	
	void addlast(int data){

		Node newnode = new Node(data);
		if(Head==null){
			Head=newnode;
		}else{
			Node temp=Head;
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=newnode;
		}
	}
	int countnode(){
		int count=0;

		Node temp=Head;
		while(temp!=null){

			count++;
			temp=temp.next;
		}
		return count;

	}
	void addAtpos(int pos,int data){
		if(pos<=0 || pos >= countnode()+2){
			System.out.println("invalid Index");
		}
		if(pos==1){
			addFirst(data);
		}
		if(pos==countnode()+1){
			addlast(data);
		}else{
			Node newnode = new Node(data);
			Node temp=Head;
		        	
			while(pos-2!=0){
				temp=temp.next;
				pos--;
			}

			newnode.next=temp.next;
			temp.next=newnode;		
		}
	}
	void printll(){
		Node temp=Head;

		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}System.out.println();
	}

	void inplacerevItr(){
		Node pre=null;
		Node curr=Head;
		Node For=null;

		while(curr!=null){
			For=curr.next;
			curr.next=pre;
			pre=curr;
			curr=For;
		}
		Head=pre;
	}
	
	void inplacerevRec(Node pre,Node curr){

		if(curr==null){
			Head=pre;
			return;
		}else{	
			Node For=curr.next;
			curr.next=pre;
			pre=curr;
			curr=For;
		}

		inplacerevRec(pre,curr);
	}
}
class Main{
	public static void main(String args[]){
		LinkedList ll=new LinkedList();
		ll.addFirst(10);
		ll.addlast(20);
		ll.addlast(30);
		ll.addlast(40);
		
		ll.printll();

		ll.inplacerevRec(null,ll.Head);
		
		ll.printll();
		
	}
}
