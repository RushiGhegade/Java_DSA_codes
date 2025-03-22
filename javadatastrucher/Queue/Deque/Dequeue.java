// Implement Dequeue using Array
// Opration :
// 1 -> PushFront()
// 2 -> popFront()
// 3 -> pushBack()
// 4 -> popBack()

import java.util.*;
class Deque{
        int arr[];
        int front;
        int rear;
        int maxsize;


        Deque(int size){
                this.arr=new int[size];
                this.front=-1;
                this.rear=-1;
                this.maxsize=size;
        }

        void pushFront(int data){
               if((front==0 && rear==maxsize-1) || (rear+1)%maxsize==front){
                        System.out.println("Queue is Full");
                        return ;
               }else if(front==-1){
                        front=rear=0;
               }else if(front==0){
                        front=maxsize-1;
               }else{
                        front=front-1;
               }

               arr[front]=data;
        }

        int popFront(){
                if(front==-1){
                        System.out.println("Queue is empty");
                        return -1;
                }

                int val=arr[front];

                if(front==rear){
                        front=rear=-1;
                }else if(front==maxsize-1){
                        front=0;
                }else{
                        front=front+1;
                }

                return val;
        }

        void pushBack(int data){
               if((front==0 && rear==maxsize-1) || ((rear+1)%maxsize==front)){
                        System.out.println("Queue is full");
                        return ;
               }else if(front==-1){
                        front=rear=0;
               }else if(front!=0 && rear==maxsize-1) {
                        rear=0;
               }else{
                        rear=rear+1;
               }

               arr[rear]=data;
        }

        int popBack(){
               if(front==-1){
                        System.out.println("Queue is empty");
                        return -1;
               }
               int val =arr[rear];

                if(front==rear){
                        front=rear=-1;
                }else if(rear==0){
                        rear=maxsize-1;
                }else{
                        rear=rear-1;
                }

               return val;
        }

        void print(){

        }

        int getRear(){
                if(front==-1){
                        System.out.println("Queue is empty");
                        return-1;
                }else{
                        return arr[rear];
                }
        }

        int getFront(){
                if(front==-1){
                        System.out.println("Queue is empty");
                        return -1;
                }else{
                        return arr[front];
                }
        }
}
class Main{
        public static void main(String args[]){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the size");
                int size=sc.nextInt();

                Deque dq=new Deque(size);

                char ch;

                do {
                        System.out.println("1-PushFront");
                        System.out.println("2-PopFront");
                        System.out.println("3-pushBack");
                        System.out.println("4-popBack");
                        System.out.println("5-Get Front");
                        System.out.println("6- Get Rear");

                        System.out.println("Enter the choice");
                        int choice=sc.nextInt();

                        switch(choice){
                                case 1:
                                        {
                                                System.out.println("Enter the data for push front ");
                                                int data=sc.nextInt();
                                                dq.pushFront(data);
                                        }
                                        break;
                                case 2:
                                        {
                                                int val=dq.popFront();
                                                if(val!=-1)
                                                        System.out.println(val+" PopFront element Successfully");

                                        }
                                        break;
                                case 3:
                                        {
                                                System.out.println("Enter the data for push back");
                                                int data=sc.nextInt();
                                                dq.pushBack(data);
                                        }
                                        break;
                                case 4:
                                        {
                                                int val=dq.popBack();
                                                if(val!=-1)
                                                        System.out.println(val+" PopBack element Successfully");

                                        }
                                        break;
                                case 5:
                                        {
                                                int val=dq.getFront();
                                                if(val!=-1)
                                                        System.out.println(val+" front");

                                        }
                                        break;
                                case 6:
                                        {
                                                int val=dq.getRear();
                                                if(val!=-1)
                                                        System.out.println(val+" Rear");
                                        }
                                        break;

                                default:
                                        System.out.println("Wrong Choice");
                                        break;
                        }


                        System.out.println("Do You Want To Continue :");
                        ch=sc.next().charAt(0);
                }while(ch=='y'||ch=='Y');
        }
}
