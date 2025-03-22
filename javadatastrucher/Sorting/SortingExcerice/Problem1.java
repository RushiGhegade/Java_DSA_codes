// Sort the Given Array Using Bubble Sort

class BubbleSort{

	// Using Recursion
	
	void bubblesort(int arr[],int n){


		if(n==arr.length-1){
			return;
		}

		for(int i=0;i<arr.length-1-n;i++){
			if(arr[i]>arr[i+1]){
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;				
			}
		}

		bubblesort(arr,n+1);
	}


	// Using For loop
	void Sort(int arr[]){
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	

	public static void main(String args[]){

		int arr[]=new int[]{1,9,2,8,3,7,4,6,5};

		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}System.out.println();

		BubbleSort obj=new BubbleSort();
		//obj.Sort(arr);
		
		obj.bubblesort(arr,0);

		for(int i=0;i<arr.length;i++){
                        System.out.print(arr[i]+" ");
                }System.out.println();
		
	}
}
