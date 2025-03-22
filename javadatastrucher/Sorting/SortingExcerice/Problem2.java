//  the the given 0s,1s,2s array using in Asending Order


// Insertion Sort
class InsertionSort{
	

	//Using For Loop
	void sort(int arr[]){
		
		for(int i=0;i<arr.length;i++){

			int element =arr[i];
			
			int j=i-1;

			while(j>=0 && arr[j]>element){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=element;
		}
	}

	// using Recursion
	void insertionsort(int arr[],int n){
		
		if(n==arr.length)
			return;

		int element=arr[n];

		int j=n-1;
		
		while(j>=0 && arr[j]>element){

			arr[j+1]=arr[j];
			j--;
		}
		arr[j+1]=element;

		insertionsort(arr,n+1);

	}

	public static void main(String args[]){
		int arr[]=new int[]{0,2,1,2,0,1};


		for(int i=0;i<arr.length;i++){

			System.out.print(arr[i]+" ");
		}System.out.println();

		InsertionSort obj=new InsertionSort();

		//obj.sort(arr);
		obj.insertionsort(arr,1);

		 for(int i=0;i<arr.length;i++){
                        System.out.print(arr[i]+" ");
                }System.out.println();

	}
}
