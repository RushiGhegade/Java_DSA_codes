/*
Given an array arr[] of size N, check if it is sorted in non-decreasing order or not.
Use quick sort
Example 1:

Input:
N = 5
arr[] = {10, 20, 30, 40, 50}
Output: 1
Explanation: The given array is sorted.
*/

class QuickSort{

	int partition(int arr[],int start,int end){
		
		int pivotele=arr[end];

		for(int i=start;i<end;i++){
			if(arr[i]>arr[i+1]){
				return 0;
			}
		}

		return 1;	
	}
	void quicksort(int arr[],int start,int end){
			
			int ans= partition(arr,start,end);
			System.out.println(ans);
	}
	
	public static void main(String args[]){
		int arr[]=new int[]{10, 20, 30, 40, 50};

		QuickSort obj=new QuickSort();
		obj.quicksort(arr,0,arr.length-1);
		//System.out.println(ans);
	}
}
