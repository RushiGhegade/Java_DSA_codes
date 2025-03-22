class Demo{
	static void sort(int arr[],int n){
		if(n==arr.length){
			return;
		}	
		int min=n;
		for(int i=n+1;i<arr.length;i++){
			if(arr[i]<arr[min]){
				min=i;
			}
		}
		int temp=arr[n];
		arr[n]=arr[min];
		arr[min]=temp;

		sort(arr,n+1);
	}
	public static void main(String args[]){
		int arr[]=new int[]{7,3,9,4,2,5,6};
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}System.out.println();

		sort(arr,0);

		System.out.println("Sorted Array:");
		for(int i=0;i<arr.length;i++){
                        System.out.print(arr[i]+" ");
                }System.out.println();

	}
}
