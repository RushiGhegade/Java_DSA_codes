/*
4. Delete middle element of a stack
Given a stack, delete the middle element of the stack without using any additional data
structure.
Middle element:- floor((size_of_stack+1)/2) (1-based indexing) from bottom of the stack.

Note: The output shown by the compiler is the stack from top to bottom.
Example 1:
Input:
Stack = {10, 20, 30, 40, 50}
Output:
ModifiedStack = {10, 20, 40, 50}
Explanation:
If you print the stack the bottom-most element will be 10 and the top-most element will
be 50. Middle element will be element at index 3 from bottom, which is 30. Deleting 30,
stack will look like {10 20 40 50}.
*/
import java.util.*;
class Middeldel{
	
	Stack middel(Stack s){
		
		int mid=(s.size()/2);
		
		s.removeElementAt(mid);

		return s;

	}
}
class Main{
	public static void main(String args[]){
		Stack s=new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);

		System.out.println(s);

		Middeldel obj=new Middeldel();
		Stack s2=obj.middel(s);
		System.out.println(s2);
	}
}
