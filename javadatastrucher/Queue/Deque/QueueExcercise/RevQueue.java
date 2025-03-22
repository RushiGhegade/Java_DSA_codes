/*
Q2. Queue Reversal
Given a Queue Q containing N elements. The task is to reverse the Queue. Your
task is to complete the function rev(), that reverses the N elements of the queue.
Example 1:
Input:
6
4 3 1 10 2 6
Output:
6 2 10 1 3 4
Explanation:
After reversing the given elements of the queue , the resultant queue will be 6 2 10
1 3 4.
*/

import java.util.*;
class Main{
	// 1st Aprroch
	Queue<Integer> revUsingArray(Queue q){

		Queue<Integer> q1=new LinkedList<Integer>();
		int arr[]=new int[q.size()];

		int i=0;
		while(!q.isEmpty()){
			arr[i]=(int)q.poll();
			i++;
		}

		for(int j=arr.length-1;j>=0;j--){
			q1.offer(arr[j]);
		}

		return q1;
	}

	// 2nd Approch
	Queue<Integer> revUsingStack(Queue q){
		
		Stack<Integer> s=new Stack<Integer>();

		while(!q.isEmpty()){
			s.push((int)q.poll());
		}

		while(!s.isEmpty()){
			q.offer(s.pop());
		}

		return q;
	}

	public static void main(String args[]){
		//4 3 1 10 2 6
		Queue<Integer> q=new LinkedList<Integer>();
		q.offer(4);
		q.offer(3);
		q.offer(1);
		q.offer(10);
		q.offer(2);
		q.offer(6);
		

		System.out.println(q);
		
		Main obj=new Main();

		//Queue<Integer> q1=obj.revUsingArray(q);

		Queue<Integer> q1=obj.revUsingStack(q);
		System.out.println(q);
		
	}
}



































