// 2nd Approch

// time complexity -> O(N^2)
// space complexity -> O(1)
// itr              -> 21 (less compare to 1st approch)
// // drowback it take same iteration when array is sort
class Demo {
	static void BubbleSort(int arr[]){
		int n=arr.length;
		
		int itr=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n-i-1;j++){
				itr++;
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(itr);
	}
	public static void main(String args[]){
		//int arr[]=new int[]{3,7,9,4,2,5,6};
		int arr[]=new int[]{0,1,2,3,4,5,6};
		BubbleSort(arr);

		for(int i=0;i<arr.length;i++){
                        System.out.print(arr[i]+" ");
                }System.out.println();
	}
}
