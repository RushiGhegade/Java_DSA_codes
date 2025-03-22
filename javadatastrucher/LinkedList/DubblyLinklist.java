class Node {
	int data;
	Node next=null;
	Node pre=null;

	Node(int data){
		this.data=data;
	}
}
class LinkedList{
	Node Head=null;

	void addFirst(int data){
		Node newnode=new Node(data);
		if(Head==null){
			Head=newnode;
		}else{
			Head.pre=newnode;
			newnode.next=Head;
			Head=newnode;
		}
	}
	void addlast(int data){
		Node newnode =new Node(data);
		Node temp=Head;

		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next=newnode;
		newnode.pre=temp;
	}
	void delpos(int pos){
		if(pos<=0 || pos >=countnode()+2){

			System.out.println("Invalid Index");
		}
		if(pos==1){
			delFirst();
		}
		if(pos==(countnode()+1)){
			dellast();
		}else{
			
			Node temp=Head;

			while(pos-2==0){
				temp=temp.next;
				pos--;
			}
			temp.next=temp.next.next;
			temp.next.next.pre=temp;


		}

	}
	void printll(){
		Node temp=Head;

		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}System.out.println();
	}
	int countnode(){
		Node temp=Head;
		int count=0;
		while(temp.next!=null){
			temp=temp.next;
			count++;
		}
		return count;
	}
	void delFirst(){
		if(Head==null){
			System.out.println("LinkedList is empty");
		}else{
			Head=Head.next;
			Head.pre=null;			
		}		
	}

	void dellast(){
		if(Head==null){
			System.out.println("LinkedList is Empty");
		}else{
			Node temp=Head;

			while(temp.next.next!=null){
				temp=temp.next;
			}
			temp.next=null;
		}
	}
}
class Main{

	public static void main(String args[]){
		LinkedList ll=new LinkedList();
		ll.addFirst(10);
		ll.addFirst(20);
		ll.addFirst(30);
		ll.printll();
		ll.addlast(5);
		ll.addlast(1);
		ll.printll();

		/*ll.delFirst();
		ll.printll();

		ll.dellast();
		ll.printll();*/

		ll.delpos(3);
		ll.printll();
	}
}
