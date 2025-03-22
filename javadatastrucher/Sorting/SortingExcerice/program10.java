/*
Given an array nums, return true if the array was originally sorted in
non-decreasing order, then rotated some number of positions (including zero).
Otherwise, return false.
There may be duplicates in the original array.
Note: An array A rotated by x positions results in an array B of the same length
such that A[i] == B[(i+x) % A.length], where % is the modulo operation.

Example 1:
Input: nums = [3,4,5,1,2]
Output: true
Explanation: [1,2,3,4,5] is the original sorted array.

You can rotate the array by x = 3 positions to begin on the element of value 3:
[3,4,5,1,2].
Example 2:
Input: nums = [2,1,3,4]
Output: false
Explanation: There is no sorted array once rotated that can make nums.
Example 3:
*/


class Demo{


	boolean sort(int arr[]){

		int index=0;
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]>arr[i+1]){
				index=i;
				break;
			}


		}

		if(index!=0){

			int k=0;

			for(int i=index+1;i<arr.length;i++){
				int element=arr[i];

				for(int j=i;j>k;j--){
					arr[j]=arr[j-1];
				}

				arr[k++]=element;				
			}
		}

		int count=0;
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]>arr[i+1])
				count++;			
		}

		if(count==0){
			return true;
		}else{
			return false;
		}

	}

	public static void main(String args[]){

		int arr[]=new int[]{3,4,5,1,2};

		Demo obj=new Demo();
		boolean ans=obj.sort(arr);
		System.out.println(ans);

	
	}
}














