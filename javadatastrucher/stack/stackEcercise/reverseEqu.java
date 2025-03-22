/*
11. Reversing the equation
Given a mathematical equation that contains only numbers and +, -, *, /. Print the
equation in reverse, such that the equation is reversed, but the numbers remain the same.
It is guaranteed that the given equation is valid, and there are no leading zeros.
Example 1:
Input:
S = "20-3+5*2"
Output: 2*5+3-20
Explanation: The equation is reversed with
numbers remaining the same.
Example 2:
Input:
S = "5+2*56-2/4"
Output: 4/2-56*2+5
Explanation: The equation is reversed with
numbers remaining the same.
*/
import java.util.*;
class Main{

	Stack reverse(String str){

		Stack s=new Stack();

		for(int i=0;i<str.length();i++){

			char ch=str.charAt(i);
			s.push(ch);
		}
		return s;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Equation :");
		String str=sc.nextLine();

		Main obj=new Main();
		Stack s=obj.reverse(str);
		 StringBuffer str1=new StringBuffer();

                while(!s.empty()){
                        str1=str1.append(((char)s.pop()));
                }

		System.out.println(str1);		
	}
}





















