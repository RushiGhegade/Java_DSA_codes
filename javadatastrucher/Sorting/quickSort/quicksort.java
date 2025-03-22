
class QuickSort{

	int partition(int arr[],int start,int end){
		int pivotele=arr[end];

		int i=start-1;

		for(int j=start;j<end;j++){
			
			if(arr[j]<=pivotele){
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		i++;

		int temp=arr[end];
		arr[end]=arr[i];
		arr[i]=temp;

		return i;
	}

	void quicksort(int arr[],int start,int end){
		
		if(start<end){
			int pivot=partition(arr,start,end);

			quicksort(arr,start,pivot-1);
			quicksort(arr,pivot+1,end);
		}	
	}
}

class Main{
	public static void main(String args[]){
		
		int arr[]=new int[]{12,7,6,14,5,15,10};

		for(int i=0;i<arr.length;i++){
                        System.out.print(arr[i]+" ");
                }System.out.println();

		QuickSort obj=new QuickSort();

		int start=0;
		int end=arr.length-1;

		obj.quicksort(arr,start,end);

		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}System.out.println();
	}
}
