/*
10. Make the array beautiful
Given an array of negative and non-negative integers. You have to make the array
beautiful. An array is beautiful if two adjacent integers, arr[i] and arr[i+1] are either
negative or non-negative. And you can do the following operation any number of times
until the array becomes beautiful.
If two adjacent integers are different i.e. one of them is negative and other is
non-negative, remove them.
Return the beautiful array after performing the above operation.
Note:An empty array is also a beautiful array. There can be many adjacent integers which
are different as stated above. So remove different adjacent integers as described above
from left to right.
Example 1:
Input: 4 2 -2 1
Output: 4 1
Explanation: As at indices 1 and 2 , 2 and -2 have
different sign, they are removed. And the the final
array is: 4 1.
*/

import java.util.*;

class Main{

	Stack Beutiful(Stack s2){
		Stack s=new Stack();
		Stack s1=new Stack();
		
		while(!s2.empty()){
			s.push(s2.pop());
		}
		

		for(int i=0;i<s.size();i++){
			int a=(int)s.pop();
			int b=(int)s.peek();
				
			if((a<0 && b<0)||(a>0 && b>0)){
				s1.push(a);
			}else{				
				s.pop();				
			}	
		}
		
		if(!s.empty()){
		
			s1.push(s.pop());
		}

		return s1;
		
	}
	public static void main(String args[]){
		Stack s=new Stack();
		s.push(4);
		s.push(2);
		s.push(-2);
		s.push(1);
		
		System.out.println(s);
		Main obj=new Main();
		Stack s1=obj.Beutiful(s);

		System.out.println(s1);		
	}
}











