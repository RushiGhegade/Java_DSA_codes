/*
Q1. Queue using two Stacks
Implement a Queue using 2 stacks s1 and s2 .
A Query Q is of 2 Types
(i) 1 x (a query of this type means pushing 'x' into the queue)
(ii) 2 (a query of this type means to pop element from queue and print the poped
element)
Note :- If there is no element return -1 as answer while popping.
Example 1:
Input:
5
1 2 1 3 2 1 4 2
Output:
2 3
Explanation:
In the first test case
1 2 the queue will be {2}
1 3 the queue will be {2 3}
2 popped element will be 2 the queue
will be {3}
1 4 the queue will be {3 4}
2 popped element will be 3.
Example 2:
*/

import java.util.*;
class Main{
	
	public static void main(String args[]){
		Queue q=new LinkedList();
		//1 2 1 3 2 1 4 2
		//1 2 2 2 1 4
		q.offer(1);
		q.offer(2);
		q.offer(2);
		q.offer(2);
		q.offer(1);
		q.offer(4);
		//q.offer(4);
		//q.offer(2);

		System.out.println(q);

		Queue q1=new LinkedList();
			
	
		
		int size=q.size();
		for(int i=0;i<size-1;i++){
			int a=(int)q.poll();
			if(a!=2){
				int b=(int)q.poll();
				i++;	
				System.out.println(a+":"+b);
				
				q1.offer(b);
				
			
			}else{
				if(!q1.isEmpty()){
					q1.poll();
				}else{
					System.out.println("-1");
				}
			}
		}

		if(!q.isEmpty()){
			int a=(int)q.poll();

			if(a==1){
				q1.offer(a);
			}else{
				q1.poll();
			}
		}

		System.out.println(q1);
	}
}


















