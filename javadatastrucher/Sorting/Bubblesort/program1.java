// 1st approch
// arr[7,3,9,4,2,5,6]
// in bubble sort maximum element going to the last

// time complexity -> o(n^2)
// space complexity -> o(1)
// itreration       -> 42  this logic requiered more iteration
class Demo{
	static void bubblesort(int arr[]){
		int n=arr.length;
		int itr=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<arr.length-1;j++){
				itr++;
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(itr);
	}
	public static void main(String args[]){
		int arr[]=new int[]{7,3,9,4,2,5,6};
		// before sort
		for(int i=0;i<arr.length;i++){
                        System.out.print(arr[i]+" ");
                }System.out.println();

		bubblesort(arr);

		// After Sort
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}System.out.println();
	}
}
