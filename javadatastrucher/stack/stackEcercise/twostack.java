// Two Stack Using Array(make inside one array two stack) 

import java.util.*;
class Twostack{
	int stackarr[];
	int top1;
	int top2;
	int maxsize;

	Twostack(int size){
		this.stackarr=new int[size];
		this.top1=-1;
		this.top2=size;
		this.maxsize=size;
	}

	void push1(int data){
		if(top2-top1>1){
			top1++;
			stackarr[top1]=data;
		}else{
			System.out.println("Stack_1 is Overflow");
		}
	}

	void push2(int data){
		if(top2-top1>1){
			top2--;
			stackarr[top2]=data;
		}else{
			System.out.println("stack_2 is overflow");
		}
	}

	int pop1(){
		if(top1==-1){
			System.out.println("Stack_1 is empty");
			return -1;
		}else{
			int val=stackarr[top1];
			top1--;
			return val;
		}
	}

	int pop2(){
		if(top2==maxsize){
			System.out.println("Stack_2 is empty");
			return -1;
		}else{
			int val=stackarr[top2];
			top2++;
			return val;
		}
	}

}

class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();

		Twostack obj=new Twostack(size);

		char ch;

		do{
			System.out.println("1 - push1");
			System.out.println("2 - push2");
			System.out.println("3 - pop1");
			System.out.println("4 - pop2");
			
			System.out.println("Enter the Choice");
			int choice=sc.nextInt();

			switch(choice){
				case 1:
					{
						System.out.println("Enter the data for stack_1");
						int data=sc.nextInt();
						obj.push1(data);
					}
					break;
				case 2:
                                        {
                                                System.out.println("Enter the data for stack_2");
                                                int data=sc.nextInt();
                                                obj.push2(data);
                                        }
                                        break;
				case 3:
                                        {
                                                int ret=obj.pop1();
						if(ret!=-1){
							System.out.println(ret+" pop");
						}
                                        }
                                        break;
				case 4:
                                        {
                                                int ret=obj.pop2();
                                                if(ret!=-1){
                                                        System.out.println(ret+" pop");
                                                }
                                        }
                                        break;
				default:
					System.out.println("Wrong Choice");
			}

			System.out.println("Do you want to continue");
			ch=sc.next().charAt(0);

		}while(ch=='Y' || ch=='y');

	}
}
