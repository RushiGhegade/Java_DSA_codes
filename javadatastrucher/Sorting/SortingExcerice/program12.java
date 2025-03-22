/*
	Given an array of integers nums, sort the array in ascending order and return it.
You must solve the problem without using any built-in functions in O(nlog(n))
time complexity and with the smallest space complexity possible.
(Solve using merge sort)

Example 1:
Input: nums = [5,2,3,1]
Output: [1,2,3,5]
Explanation: After sorting the array, the positions of some numbers are not
changed (for example, 2 and 3), while the positions of other numbers are changed
(for example, 1 and 5).
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
			if(arr1[i]<arr[j]){
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
		int arr[]=new int[]{5,2,3,1};

		for(int i=0;i<arr.length;i++){
                        System.out.print(arr[i]+" ");
                }System.out.println();

		int start=0;
		int end=arr.length-1;

		MargeSort obj=new MargeSort();

		obj.margesort(arr,start,end);

		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}System.out.println();
	}
}
