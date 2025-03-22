// Implement Circular Queue using Array

// opration
// 1-> Enqueue
// 2-> Dequeue
// 3-> print 
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

	void Enqueue(int data){

			if((front==0 && rear==maxsize-1) || ((rear+1) % maxsize == front)){
				System.out.println("Queue is Fulll");
				return;
			}else if(front==-1){
				front=rear=0;
			}else if((front!=0) && rear==maxsize-1){
				rear=0;
			}else{
				rear++;
			}

			arr[rear]=data;
	}

	int Dequeue(){
		
		if(front==-1){
			System.out.println("Queue is empty :");
			return -1;
		}else {
			int val=arr[front];

			if(front==rear){
				front=rear=-1;
			}else if(front==maxsize-1){
				front=0;
			}else{
				front++;
			}

			return val;
		}
	}

	void print(){
		if(front==-1){
			System.out.println("queue is empty");
			return;
		}
		if(front<=rear){
			for(int i=front;i<=rear;i++){
				System.out.print(arr[i]+" ");
			}
		}else{
			for(int i=front;i<maxsize;i++){
				System.out.print(arr[i]+" ");
			}

			for(int i=0;i<=rear;i++){
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
	}

}
class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array size");
		int size=sc.nextInt();

		Queue q=new Queue(size);

		char ch;
		do{
			System.out.println("1-Enqueue");
			System.out.println("2-dequeue");
			System.out.println("3-print");

			System.out.println("Enter your choice :");
			int choice=sc.nextInt();

			switch(choice){
				
				case 1:
					{
						System.out.println("Enter the data");
						int data=sc.nextInt();
						q.Enqueue(data);
					}
					break;
				case 2:
					{
						int val=q.Dequeue();
						if(val!=-1)
							System.out.println(val +" Enqueue Successfully");

					}
					break;
				case 3:
					{
						q.print();

					}
					break;

				default:
					System.out.println("Wrong Choice");
					break;
			}



			System.out.println("Do you want to continue");
			ch=sc.next().charAt(0);
		}while(ch=='y' || ch=='Y');
	}
}
