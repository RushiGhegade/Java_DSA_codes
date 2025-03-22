// given an array of size n reverse the array don't using extra space
// space Complexity => O(1)  // dont take extra array

class Demo{
	public static void main(String args[]){
		int arr[]=new int[]{8,4,1,3,9,2,6,7};

		int i=0;
		int j=arr.length-1;

		while(i<j){
			/*int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;*/

			arr[i]=arr[i]+arr[j];
			arr[j]=arr[i]-arr[j];
			arr[i]=arr[i]-arr[j];

			i++;
			j--;
		}

		for(int k=0;k<arr.length;k++){
			System.out.print(arr[k]+" ");
		}
	}
}
