// Using Recursion
class Demo{

	static void InsertionSort(int arr[],int n){
		if(n==arr.length){
			return;
		}	

		int element=arr[n];
		int j=n-1;

		while(j>=0 && arr[j]>element){
			arr[j+1]=arr[j];
			j--;
		}
		arr[j+1]=element;

		InsertionSort(arr,n+1);
	}
	public static void main(String args[]){
		int arr[]=new int[]{7,3,9,4,2,5,6};
		int n=1;
		InsertionSort(arr,n);

		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}System.out.println();
	}
}
