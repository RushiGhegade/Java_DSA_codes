/*
You are given two integer arrays nums1 and nums2, sorted in non-decreasing
order, and two integers m and n, representing the number of elements in nums1 and
nums2 respectively.
Merge nums1 and nums2 into a single array sorted in non-decreasing order.
The final sorted array should not be returned by the function, but instead be stored
inside the array nums1. To accommodate this, nums1 has a length of m + n, where
the first m elements denote the elements that should be merged, and the last n
elements are set to 0 and should be ignored. nums2 has a length of n.

Example 1:
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3

Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from
*/

class Demo{
	
	void sort(int arr1[],int arr2[]){

		
		int arr3[]=new int[arr1.length+arr2.length];

		int i=0;
		int j=0;
		int k=0;
		while(i<arr1.length && j< arr2.length){

			if(arr1[i]<arr2[j]){
				if(arr1[i]!=0){
					arr3[k]=arr1[i];
					k++;
				}
				i++;
			}else{
				if(arr2[j]!=0){
                                        arr3[k]=arr2[j];
					k++;
                                }
				j++;
			}
		}

		while(i<arr1.length){
			if(arr1[i]!=0){
				arr3[i]=arr1[i];
				k++;
			}
			i++;
			
		}

		while(j<arr2.length){
			if(arr2[j]!=0){
				arr3[k]=arr2[j];
				k++;
			}
			j++;
		}

		for(int x=0;x<k;x++){
			System.out.print(arr3[x]+" ");
		}System.out.println();
	}

	public static void main(String args[]){
		int arr1[]=new int[]{1,2,3,0,0,0};
		int arr2[]=new int[]{2,5,6};

		Demo obj=new Demo();

		obj.sort(arr1,arr2);


	}
}
