/*
Q4. Stack using two queues
Implement a Stack using two queues q1 and q2.
Example 1:
Input:
push(2)
push(3)

pop()
push(4)
pop()
Output: 3 4
Explanation:
push(2) the stack will be {2}
push(3) the stack will be {2 3}
pop() poped element will be 3 the
stack will be {2}
push(4) the stack will be {2 4}
pop() poped element will be 4
*/

import java.util.*;
class Demo{
   	// using Predefine Queue 
	void push(Queue q,int n){
		
		if(q.isEmpty()){
			q.offer(n);
		}else if(!q.isEmpty()){
			
			Queue q2=new LinkedList();

			while(!q.isEmpty()){
				q2.offer((int)q.poll());
			}

			q.offer(n);

			while(!q2.isEmpty()){
				q.offer((int)q2.poll());
			}
		}	
	}

	int pop(Queue q){
		if(q.isEmpty()){
			return -1;
		}else{
			return (int)q.poll();
		}
	}
	public static void main(String args[]){
		
		Demo obj=new Demo();

		Queue q=new LinkedList();

		obj.push(q,2);

		System.out.println(q);

		obj.push(q,3);

                System.out.println(q);

		int val=obj.pop(q);
		System.out.println("pop :"+val);

		obj.push(q,4);

		obj.pop(q);

		System.out.println(q);
	}
}


















