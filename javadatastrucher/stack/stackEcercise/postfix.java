/*
8. Evaluation of Postfix Expression
Given string S representing a postfix expression, the task is to evaluate the expression
and find the final value. Operators will only include the basic arithmetic operators like *,
/, + and -.
Example 1:
Input: S = "231*+9-"
Output: -4
Explanation:
After solving the given expression,
we have -4 as a result.
Example 2:
Input: S = "123+*8-"
Output: -3
Explanation:
After solving the given postfix
expression, we have -3 as a result.
*/

import java.util.*;
class Evaluat{
	int postfix(String str){

		Stack s=new Stack();
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);

			if(ch=='+' || ch=='-' || ch=='*'){
				int a=(int)s.pop();
				int b=(int)s.pop();
				if(ch=='+'){
					int result=b+a;
					s.push(result);
				}else if(ch=='*'){
					int result=b*a;
                                        s.push(result);
				}else if(ch=='-'){
                                        int result=b-a;
                                        s.push(result);
                                }
				
			}else{
				int val=Character.getNumericValue(ch);
				
				s.push(val);
			}
		}
		return (int)s.peek();
	}
}

class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Expression");
		String str=sc.nextLine();

		Evaluat obj=new Evaluat();
		int val=obj.postfix(str);
		System.out.println(val);
	}
}





