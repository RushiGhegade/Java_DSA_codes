// insertion sort

// TimeComplexity -> O(N^2)
// space Complexity -> O(1)
class Demo{
	
	static void InsertionSort(int arr[]){
		int n=arr.length;
		int itr=0;
		for(int i=1;i<n;i++){
			int element =arr[i];
			int j=i-1;

			while(j>=0 && arr[j]>element ){
				itr++;
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=element;
		}
		System.out.println(itr);
	}
	public static void main(String args[]){
		int arr[]=new int[]{7,3,9,4,2,5,6};

		InsertionSort(arr);
		
			
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}System.out.println();


	}
}
