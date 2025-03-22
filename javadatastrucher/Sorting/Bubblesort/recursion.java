// using recursion
// ittertion are more
class Demo{
	static void sort(int arr[],int n){
		if(n==1){
			return ;
		}

		for(int j=0;j<n-1;j++){
			int temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
		}

		sort(arr,n-1);
	}
	public static void main(String args[]){
		int arr[]=new int[]{3,7,9,4,2,5,6};
		int n=arr.length;
		sort(arr,n);
	}
}
