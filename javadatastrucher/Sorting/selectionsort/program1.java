
class Selection{

	// using recursion
	void rsort(int n,int arr[]){
		if(n==arr.length-1){
			return;
		}

		int min=n;
		for(int i=n+1;i<arr.length;i++){
			if(arr[min]>arr[i]){
				min=i;
			}
		}
		int temp=arr[min];
		arr[min]=arr[n];
		arr[n]=temp;

		rsort(n+1,arr);
	}	
	// without recursion
	void sort(int arr[]){	

		int n=arr.length;
		for(int i=0;i<n-1;i++){
			int min=i;
			for(int j=i+1;j<n;j++){
				if(arr[min]>arr[j]){
					min=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
	}
}

class Main{
	public static void main(String args[]){
		Selection obj=new Selection();
		
		int arr[]=new int[]{9,2,7,3,1,8,4,6};

		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}System.out.println();

		obj.rsort(0,arr);

		for(int i=0;i<arr.length;i++){
                        System.out.print(arr[i]+" ");
                }System.out.println();
	}
}
