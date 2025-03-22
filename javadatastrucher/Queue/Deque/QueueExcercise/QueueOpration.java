/*
Q5. Queue Operations
Given N integers, the task is to insert those elements in the queue. Also, given M
integers, the task is to find the frequency of each number in the Queue.
Note:
insert() will be called N times by main().
findFrequency() will be called M times by main();
Where k is each element passing through respective function calls.

Example 1:
Input:
N = 8
1 2 3 4 5 2 3 1
M = 5
1 3 2 9 10
Output:
2
2
2
-1
-1
Explanation:
After inserting 1, 2, 3, 4, 5, 2, 3 and 1 into the queue, frequency of 1 is 2, 3 is 2 and
2 is 2. Since 9 and 10 are not there in the queue we output -1 for them.
Example 2:
*/
import java.util.*;
class Demo{

	void frequency(Queue q,int arr[]){
		
		Queue q1=new LinkedList();

		for(int i=0;i<arr.length;i++){
			int count=0;
			if(!q.isEmpty()){
				while(!q.isEmpty()){
					if(arr[i]==(int)q.peek())	{
						count++;
					}
					q1.offer((int)q.poll());
				}
			}else{
				while(!q1.isEmpty()){
					if(arr[i]==(int)q1.peek())       {
                                        	count++;
                                	}
                               	 	q.offer((int)q1.poll());
				}
			
			}
			if(count!=0){
				System.out.println("frequency of "+arr[i]+" is :"+count);
			}else{
				System.out.println("frequency of "+arr[i]+" is :-1");
			}
		}
	}

	public static void main(String args[]){
		// 1 2 3 4 5 2 3 1
		Queue q=new LinkedList();
		// insert Element in Queue
		q.offer(1);
		q.offer(2);
		q.offer(3);
		q.offer(4);
		q.offer(5);
		q.offer(2);
		q.offer(3);
		q.offer(1);

		System.out.println("Queue element : \n"+q);

		System.out.println("List of the Number:");
		int arr[]=new int[]{1 ,3, 2, 9, 10};
		
		Demo obj=new Demo();
		obj.frequency(q,arr);
	}
}	
