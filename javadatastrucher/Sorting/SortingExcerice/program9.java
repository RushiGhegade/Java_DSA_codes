/*
You are given a 0-indexed integer array nums and a target element target.
A target index is an index i such that nums[i] == target.
Return a list of the target indices of nums after sorting nums in non-decreasing
order. If there are no target indices, return an empty list. The returned list must be
sorted in increasing order.

Example 1:
Input: nums = [1,2,5,2,3], target = 2
Output: [1,2]
Explanation: After sorting, nums is [1,2,2,3,5].
The indices where nums[i] == 2 are 1 and 2.

Example 2:
Input: nums = [1,2,5,2,3], target = 3
Output: [3]
Explanation: After sorting, nums is [1,2,2,3,5].
The index where nums[i] == 3 is 3.
*/

import java.util.*;
class Demo{
	
	void findIndex(int arr[],int target){
		
		List<Integer> l=new LinkedList<Integer>();

		for(int i=0;i<arr.length;i++){
			if(arr[i]==target){
				l.add(i);
			}
		}

		System.out.println(l);
	}

	void sort(int arr[],int target){
		
		for(int i=0;i<arr.length;i++){
			boolean flag=true;
			for(int j=0;j<arr.length-1-i;j++){
				
				if(arr[j]>arr[j+1]){
					flag=false;
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			if(flag==true)
				break;
		}

		findIndex(arr,target);
	}

	public static void main(String args[]){
		
		int arr[]=new int[]{1,2,5,2,3};
		int target=2;

		Demo obj=new Demo();
		obj.sort(arr,target);
	}
}
