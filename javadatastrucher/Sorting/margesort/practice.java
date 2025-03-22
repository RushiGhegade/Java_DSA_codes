class MargeSort{
	
	void marge(int arr[],int start,int mid,int end){

		int n1=mid-start+1;
		int n2=end-mid;

		int arr1[]=new int[n1];
		int arr2[]=new int[n2];

		for(int i=0;i<arr1.length;i++){
			arr1[i]=arr[start+i];
		}

		for(int j=0;j<arr2.length;j++){
			arr2[j]=arr[mid+1+j];
		}

		// marge Logic
		int i=0;
		int j=0;
		int k=start;

		while(i<arr1.length && j<arr2.length){
			if(arr1[i]<arr2[j]){
				arr[k]=arr1[i];
				i++;
			}else{
				arr[k]=arr2[j];
				j++;
			}
			k++;
		}

		while(i<arr1.length){
			arr[k]=arr1[i];
			i++;
			k++;
		}

		while(j<arr2.length){
			arr[k]=arr2[j];
			j++;
			k++;
		}
	}
	void margesort(int arr[],int start,int end){
		
		if(start<end){
			
			int mid=start+(end-start)/2;

			margesort(arr,start,mid);
			margesort(arr,mid+1,end);

			marge(arr,start,mid,end);
		}
	}
}
class Main{
	public static void main(String args[]){
		
		int arr[]=new int[]{1,9,8,7,4,5,2,3};

		for(int i=0;i<arr.length;i++){
                        System.out.print(arr[i]+" ");
                }System.out.println();

		MargeSort obj=new MargeSort();

		obj.margesort(arr,0,arr.length-1);

		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}System.out.println();
	}
}
