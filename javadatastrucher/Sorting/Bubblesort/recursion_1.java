// using recursiob Approch - 2

// it required less iteration compare to previous
class Demo{
	static int itr=0;
	static void sort(int arr[],int n){
		if(n==1){
			return;
		}
		boolean swap=false;
		for(int j=0;j<n-1;j++){
			itr++;
			if(arr[j]>arr[j+1]){
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				swap=true;
			}
		}

		if(swap==false){
			return;
		}

		sort(arr,n-1);
	}
	public static void main(String args[]){
		int arr[]=new int[]{3,7,9,4,2,5,6};
		int n=arr.length;
		sort(arr,n);

		System.out.println(itr);

		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}System.out.println();
	}
}
