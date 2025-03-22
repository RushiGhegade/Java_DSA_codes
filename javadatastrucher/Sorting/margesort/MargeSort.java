// Marge Sort (Imp)

class MargeSort{
	
	void marge(int arr[],int start,int mid,int end){
		
		int n1=mid-start+1;  // size left size array
		int n2=end-mid;     // size of right side array

		int arr1[]=new int[n1];  // store left side element in arr1
		int arr2[]=new int[n2];  // store right side element in arr2


		for(int i=0;i<arr1.length;i++){
			arr1[i]=arr[start+i];
		}

		for(int i=0;i<arr2.length;i++){
			arr2[i]=arr[mid+1+i];
		}

		// marge two array
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
			//int mid=(start+end)/2;
			margesort(arr,start,mid);  // for Left Side
			margesort(arr,mid+1,end);  // for Right side

			marge(arr,start,mid,end);


		}
	}
}
class Main{
	public static void main(String args[]){
		
		int arr[]=new int[]{9,1,8,2,7,3,6,4};

		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}System.out.println();

		MargeSort obj=new MargeSort();
		
		int start=0;
		int end=arr.length-1;

		obj.margesort(arr,start,end);

		for(int i=0;i<arr.length;i++){
                        System.out.print(arr[i]+" ");
                }System.out.println();
	}
}
