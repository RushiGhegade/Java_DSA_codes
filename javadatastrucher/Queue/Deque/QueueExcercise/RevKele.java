/*
Q3. Reverse First K elements of Queue
Given an integer K and a queue of integers, we need to reverse the order of the first
K elements of the queue, leaving the other elements in the same relative order.
Only following standard operations are allowed on queue.
enqueue(x) : Add an item x to rear of queue
dequeue() : Remove an item from front of queue
size() : Returns number of elements in queue.
front() : Finds front item.
Note: The above operations represent the general processings. In-built functions of
the respective languages can be used to solve the problem.
Example 1:
Input:
5 3
1 2 3 4 5
Output:
3 2 1 4 5

Explanation:
After reversing the given
input from the 3rd position the resultant
output will be 3 2 1 4 5.
*/

import java.util.*;
class Main{
	
	Queue<Integer> reversek(Queue<Integer> q , int k){
		
		Stack<Integer> s=new Stack<Integer>();

		for(int i=0;i<k;i++){
			s.push((int)q.poll());
		}

		Queue q1=new LinkedList();

		while(!s.empty()){
			q1.offer((int)s.pop());
		}

		while(!q.isEmpty()){
			q1.offer((int)q.poll());
		}

		return q1;
	}

	public static void main(String args[]){
		//1 2 3 4 5
		Queue<Integer> q=new LinkedList<Integer>();
		q.offer(1);
		q.offer(2);
		q.offer(3);
		q.offer(4);
		q.offer(5);

		int k=2;
		

		System.out.println("Queue :"+q);
		System.out.println("k :"+k);


		Main obj=new Main();
		Queue<Integer> q1=obj.reversek(q,k);

		System.out.println(q1);

	
	}
}




























