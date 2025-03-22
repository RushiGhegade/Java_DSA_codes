// implements Circular Queue using LinkedList
import java.util.*;
class Node{
	
	int data;
	Node next=null;

	Node(int data){
		this.data=data;	
	}

}

class LlQueue{
	Node Front=null;
	Node rear=null;

	void Enqueue(int data){
		
		Node newnode=new Node(data);

		if(Front==null){
			Front=rear=newnode;
		}else{
			rear.next=newnode;
			rear=newnode;
		}
	}

	int Dequeue(){

		if(Front==null){
			System.out.println("Linkedlist Queue is empty");
			return -1;
		}else{
			int val=Front.data;
			Front=Front.next;
			return val;
		}
	}

	void print(){
		
		if(Front==null){
			System.out.println("Linkedlist is Empty");
		}else{
			Node temp=Front;
			
			while(temp.next!=null){
				System.out.print(temp.data+"-->");
				temp=temp.next;
			}
			System.out.println(temp.data);			
		}
	}

	int FindMid(){

		if(Front==null){
			System.out.println("LinkedList Queue is Empty");
			return -1;
		}else{		
			Node First=Front;
			Node Sec=Front.next;
			while(Sec!=null){
				First=First.next;
			
				Sec=Sec.next;
				if(Sec!=null)
					Sec=Sec.next;
			}
			return First.data;
		}
	}
}


class Main{

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		LlQueue ll=new LlQueue();

		char ch;
		do{
			System.out.println("1- Enqueue");
			System.out.println("2- Dequeue");
			System.out.println("3- print");
			System.out.println("4-Find Mid Element");

			System.out.println("Enter the Opration");
			int choice=sc.nextInt();

			switch(choice){
	
				case 1:
					{
						System.out.println("Enter the data");
						int data=sc.nextInt();

						ll.Enqueue(data);
					}
					break;
				case 2:
					{
						int val=ll.Dequeue();
						if(val!=-1)
							System.out.println(val+ " Dequeue element" );
					}	
					break;
				case 3:
					{
						ll.print();						
					}break;
				case 4:
					{
						int mid=ll.FindMid();
						if(mid!=-1)
							System.out.println(mid+" Mid Element");
					}
					break;
				default :
					System.out.println("Wrong Choice");
					break;	

			}



			System.out.println("Do You Want To Continue?");
			ch=sc.next().charAt(0);
		}while(ch=='y'|| ch=='Y');
	}
}
