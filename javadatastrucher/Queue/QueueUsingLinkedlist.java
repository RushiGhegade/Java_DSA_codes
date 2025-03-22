// Implement Queue Using  LinkedList

class Node{

	int data;
	Node next=null;

	Node(int data){
		this.data=data;
	}
}
class Queue{
	Node front=null;  // head and front doing same opration in linkedlist
	Node rear=null;
	
	void enqueue(int data){
		Node newnode=new Node(data);

		if(front==null){
			front=newnode;
			rear=newnode;
		}else{
			rear.next=newnode;
			rear=newnode;
		}
		System.out.println(data+" Enqueue Successfully");
	}

	int dequeue(){
		if(rear==null){
			System.out.println("Linked List Is Empty");
			return -1;
		}else{
			/*if(front==null){
				System.out.println("Linkedlist is Empty");
				return -1;
			}else{
				int val=front.data;
				front=front.next;
				return val;
			}*/

			int val=front.data;
			front =front.next;
			
			if(front==rear.next)
				front=rear=null;
			
			return val;
		}
	}

	int front(){
		if(front==null){
			System.out.println("LinkedList is Empty");
			return -1;
		}else{
			return front.data;
		}
	}

	int rear(){
                if(rear==null){
                        System.out.println("LinkedList is Empty");
                        return -1;
                }else{
                        return rear.data;
                }
        }

	void print(){
		if(front==null){
			System.out.println("Linkedlist is empty");
		}else{

			Node temp=front;
			while(temp!=rear.next){
				System.out.print(temp.data+ " ");
				temp=temp.next;
			}System.out.println();			
		}
	}

}
class Main{
	public static void main(String args[]){
		
		Queue q=new Queue();

		int val=q.front();
                if(val!=-1){
                        System.out.println(val +" Front");
                }

                val=q.rear();
                if(val!=-1){
                        System.out.println(val +" rear");
                }

		q.enqueue(10);
		q.enqueue(20);
		//q.enqueue(30);
		
		
		System.out.println("front "+q.front());
		System.out.println("Rear "+q.rear());

		q.print();

		val=q.dequeue();
		if(val!=-1){
			System.out.println(val +" deQueue Successfully");
		}
		
		q.print();

		val=q.dequeue();
                if(val!=-1){
                        System.out.println(val +" deQueue Successfully");
                }
	
		val=q.front();
                if(val!=-1){
                        System.out.println(val +" Front");
                }

		val=q.rear();
                if(val!=-1){
                        System.out.println(val +" rear");
                }

	//	q.print();

		q.enqueue(30);

		System.out.println("front "+q.front());
                System.out.println("Rear "+q.rear());

		 q.print();
	}
}
