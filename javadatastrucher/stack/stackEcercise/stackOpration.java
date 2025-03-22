/*
13. Stack Operations
This Java module deals with Stacks, Queues, and ArrayLists. We'll perform various
operations on them.
Given a stack of integers and Q queries. The task is to perform operation on stack
according to the query.
Note: use push() to add element in the stack, peek() to get topmost element without
removal, pop() gives topmost element with removal, search() to return position if found
else -1.
Input Format:

First line of input contains nubmer of testcases T. For each testcase, first line of input
contains Q, number of queries. Next line contains Q queries seperated by space. Queries
are as:
i x : (adds element x in the stack).
r : (returns and removes the topmost element from the stack).
h : Prints the topmost element.
f y : (check if the element y is present or not in the stack). Print "Yes" if present, else
"No".
Output Format:
For each testcase, perform Q queries and print the output wherever required.
Constraints:
1 <= T <= 100
1 <= Q <= 103
Example:
Input:
2
6
i 2 i 4 i 3 i 5 h f 8
4
i 3 i 4 r f 3
Output:
5
No
Yes
Explanation:
Testcase 1: Inserting 2, 4, 3, and 5 onto the stack. Returning top element which is 5.
Finding 8 will give No, as 8 is not in the stack.
*/


import java.util.*;
class Main{
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();

		Stack s=new Stack();

		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);

			s.push(ch);
		}

		System.out.println(s);

		Stack s1=new Stack();
		
		while(!s.empty()){
			s1.push(s.pop());
		}

		

		while(!s1.empty()){
			
			char ch=(char)s1.pop();

			if(ch=='i'){
				char val=(char)s1.pop();
				s.push(val);
				System.out.println(val+" Push Successfully :");
				
			}else if(ch=='r'){
				char val=(char)s.pop();
				System.out.println(val+" Popped Element :");

			}else if(ch=='h'){
				System.out.println(s.peek()+" Top Most Element :");

			}else if(ch=='f'){
				char val=(char)s1.pop();

				int ret=s.search(val);
				if(ret!=-1)
					System.out.println(val+" is present in stack");
				else
					System.out.println(val +" is Not Present in Stack");
			}
		}


	}
}










































