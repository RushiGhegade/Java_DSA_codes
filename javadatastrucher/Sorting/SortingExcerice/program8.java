/*
Problem Statement 8:
Given an array of integers nums, sort the array in ascending order and return it.
You must solve the problem without using any built-in functions in O(nlog(n))
time complexity and with the smallest space complexity possible.

Example 1:
Input: nums = [5,2,3,1]
Output: [1,2,3,5]
Explanation: After sorting the array, the positions of some numbers are not
changed (for example, 2 and 3), while the positions of other numbers are changed
(for example, 1 and 5).

// it means use a quick sort
*/

class QuickSort{



	int partition(int arr[],int start,int end){

		int pivotele=arr[end];
		int j=start-1;

		for(int i=start;i<end;i++){
			if(arr[i]<pivotele){
				j++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		j++;
		int temp=arr[j];
		arr[j]=arr[end];
		arr[end]=temp;

		return j;
	}

	void quicksort(int arr[],int start,int end){
		
		if(start<end){

			int pivotindex=partition(arr,start,end);

			quicksort(arr,start,pivotindex-1);
			quicksort(arr,pivotindex+1,end);
		}
	}

	public static void main(String args[]){
		
		int arr[]=new int[]{5,2,3,1};

		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+ " ");
		}System.out.println();
		
		int start=0;
		int end=arr.length-1;

		QuickSort obj=new QuickSort();

		obj.quicksort(arr,start,end);

		for(int i=0;i<arr.length;i++){
                        System.out.print(arr[i]+ " ");
                }System.out.println();


	}
}
