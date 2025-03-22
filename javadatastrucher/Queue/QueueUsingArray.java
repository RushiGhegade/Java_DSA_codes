// Implement queue using Array ;

import java.util.*;
class Queue{

	int arr[];
	int front;
	int rear;
	int maxsize;

	Queue(int size){
		this.arr=new int[size];
		this.front=-1;
		this.rear=-1;
		this.maxsize=size;
	}

	void enqueue(int data){
		
		if(rear==maxsize-1){
			System.out.println("Queue is Full");
			return ;
		}

		if(front==-1 )
			front=rear=0;			
		else
			rear++;

		arr[rear]=data;
	}

	int dequeue(){
		
		if(front==-1){
			System.out.println(" Queue is empty ");
			return -1;
		}else{
			int val=arr[front];

			front++;

			if(front>rear)
				rear=front=-1;

			return val;
		}
	}

	int front(){
		if(front==-1){
			System.out.println("Queue is empty");
			return -1;
		}else{
			return arr[front];
		}

	}

	int rear(){
		if(rear==-1){
			System.out.println("Queue is empty");
			return -1;
		}else{
			return arr[rear];
		}
	}

	void print(){
		if(front==-1){
			System.out.println("Queue is empty");
			return;
		}else{
			for(int i=front;i<=rear;i++){
				System.out.print(arr[i]+" ");
			}System.out.println();
		}
	}
}

class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size");
		int size=sc.nextInt();

		Queue q=new Queue(size);

		char ch;
		do{
			System.out.println("1- Enqueue");
			System.out.println("2- dequeue");
			System.out.println("3- Front");
			System.out.println("4- Rear");
			System.out.println("5- printqueue");

			System.out.println("Enter Your Choice");
			int choice= sc.nextInt();

			switch(choice){

				case 1:
					{
						System.out.println("Enter the data");
						int data=sc.nextInt();

						q.enqueue(data);
					}
					break;
				case 2:
					{
						int val=q.dequeue();

						if(val!=-1)
							System.out.println(val + " Dequeue");
					}
					break;

				case 3:
					{
						int val=q.front();
						if(val!=-1)
							System.out.println(val);

					}
					break;
				case 4:
					{
						int val=q.rear();
						if(val!=-1){
							System.out.println(val);
						}
					}
					break;
				case 5:
					{
						q.print();
					}
					break;


				default :
					System.out.println("Wrong Choice");
					break;


			}

			System.out.println("Do You Want To Continue?");
			ch=sc.next().charAt(0);
		}while(ch=='y' || ch=='Y');

	}
}
