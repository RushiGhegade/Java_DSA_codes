/*
Given an array arr[] of size N, check if it is sorted in non-decreasing order or not.
Example 1:
Input:
N = 5
arr[] = {10, 20, 30, 40, 50}
Output: 1
*/

class Demo{
	
	int sorted(int arr[]){
		
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]>arr[i+1])
				return 0;
		}
		return 1;
	}
	public static void main(String args[]){
		int arr[]=new int[]{90, 80, 100, 70, 40, 30};

		Demo obj=new Demo();

		int ans=obj.sorted(arr);
		System.out.println(ans);
	}
}
