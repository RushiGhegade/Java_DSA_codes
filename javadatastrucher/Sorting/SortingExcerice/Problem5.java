/*
Given an array arr[], its starting position l and its ending position r. Sort the array
using the Merge Sort algorithm.
Example 1:
Input:
N = 5
arr[] = {4 1 3 9 7}
Output:
1 3 4 7 9
Example 2:
Input:
N = 10
arr[] = {10 9 8 7 6 5 4 3 2 1}
Output:
1 2 3 4 5 6 7 8 9 10
*/

class MargeSort{

	void sort(int arr[],int start,int mid,int end){
		
		int n1=mid-start+1;
		int n2=end-mid;

		int arr1[]=new int[n1];
		int arr2[]=new int[n2];

		for(int i=0;i<arr1.length;i++){
			arr1[i]=arr[start+i];
		}

		for(int i=0;i<arr2.length;i++){
			arr2[i]=arr[mid+1+i];
		}

		int i=0;
		int j=0;
		int k=start;

		while(i<arr1.length && j<arr2.length){
				if(arr1[i]<arr2[j]){
					arr[k]=arr1[i];
					i++;
				}else{
					arr[k]=arr2[j];
					j++;
				}	
				k++;	
		}

		while(i<arr1.length){
			arr[k]=arr1[i];
			i++;
			k++;
		}

		while(j<arr2.length){
			arr[k]=arr2[j];
			j++;
			k++;
		}	

	}

	void margesort(int arr[],int start,int end){
		
		if(start<end){
			int mid=start+(end-start)/2;
			margesort(arr,start,mid);
			margesort(arr,mid+1,end);

			sort(arr,start,mid,end);
		}

	}

	public static void main(String args[]){
		int arr[]=new int[]{10 ,9 ,8 ,7 ,6 ,5 ,4 ,3 ,2, 1};

		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}System.out.println();

		MargeSort obj=new MargeSort();

		obj.margesort(arr,0,arr.length-1);

		for(int i=0;i<arr.length;i++){
                        System.out.print(arr[i]+" ");
                }System.out.println();

	}
}























