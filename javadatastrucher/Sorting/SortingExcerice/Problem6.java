/*
Given a random set of numbers, Print them in sorted order.
Example 1:
Input:
N = 4

arr[] = {1, 5, 3, 2}
Output: {1, 2, 3, 5}
Explanation: After sorting array will
be like {1, 2, 3, 5}.


Expected Time Complexity: O(N * log N)
Expected Auxiliary Space: O(1)
*/


class QuickSort{

	int partition(int arr[],int start,int end){
		
		int pivotele=arr[end];

		int j=start-1;

		for(int i=start;i<end;i++){
			
			if(arr[i]<=pivotele){
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
			int pivot =partition(arr,start,end);

			quicksort(arr,start,pivot-1);
			quicksort(arr,pivot+1,end);
		}
	}
	public static void main(String args[]){
	
		int arr[]=new int[]{1, 5, 3, 2};

		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}System.out.println();


		QuickSort obj=new QuickSort();

		obj.quicksort(arr,0,arr.length-1);

		for(int i=0;i<arr.length;i++){
                        System.out.print(arr[i]+" ");
                }System.out.println();
	}
}


















