/* Find the min in the stack
9. Get min at pop
Now, we'll try to solve a famous stack problem.
You are given an array A of size N. You need to first push the elements of the array into a
stack and then print minimum in the stack at each pop until stack becomes empty.
Example 1:
Input:

N = 5
A = {1 2 3 4 5}
Output:
1 1 1 1 1
Explanation:
After pushing elements to the stack,
the stack will be "top -> 5, 4, 3, 2, 1".
Now, start popping elements from the stack
popping 5: min in the stack is 1.popped 5
popping 4: min in the stack is 1. popped 4
popping 3: min in the stack is 1. popped 3
popping 2: min in the stack is 1. popped 2
popping 1: min in the stack is 1. popped 1
*/
import java.util.*;
class Minstack{
	void Min(int arr[]){
		Stack s=new Stack();

		for(int i=0;i<arr.length;i++){
			s.push(arr[i]);
		}

		while(!s.empty()){
			int min=Integer.MAX_VALUE;

			for(int i=0;i<s.size();i++){
				int val=(int)s.elementAt(i);
				if(min>val){
					min=(int)s.elementAt(i);
				}
			}
			System.out.print(min+" ");
			s.pop();
		}
	}
}

class Main{
	public static void main(String args[]){
		
		int arr[]=new int[]{1 ,6 ,43 ,1 ,2 ,0 ,5};

		Minstack obj=new Minstack();
		obj.Min(arr);

	}
}
