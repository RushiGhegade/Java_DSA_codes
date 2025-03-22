// Array Rotation
// arr[]={1,2,3,4}
// k=2;
//
// arr[]={3,4,1,2};

class Demo{
	public static void main(String args[]){
		int arr[]=new int[]{1,2,3,4};
		int k=3;
		int n=arr.length;
		for(int i=0;i<k;i++){
			int m=arr[n-1];
			for(int j=n-2;j>=0;j--){
				arr[j+1]=arr[j];
			}
			arr[0]=m;
		}

		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}System.out.println();

	}
}

// TimeComplexity => k * n => O(k*n)
