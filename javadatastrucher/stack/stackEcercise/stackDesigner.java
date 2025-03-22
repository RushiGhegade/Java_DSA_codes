/*
You are given an array arr of size N. You need to push the elements of the array into a
stack and then print them while popping.
Example 1:
Input:
n = 5
arr = {1 2 3 4 5}
Output:
5 4 3 2 1
Example 2:
Input:
n = 7
arr = {1 6 43 1 2 0 5}
Output:
5 0 2 1 43 6 1
*/
import java.util.*;
class StackDemo{
	public static void main(String args[]){

		int arr[]=new int[]{1,2,3,4,5};

		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}System.out.println();

		Stack<Integer> s=new Stack<Integer>();

		for(int i=0;i<arr.length;i++){
			s.push(arr[i]);
		}
		Stack<Integer> s2=new Stack<Integer>();

		while(!s.empty()){
			s2.push(s.pop());	
		}

		System.out.println(s2);
	}	
}

