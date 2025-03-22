// given an array of size n print all the sub array 


class Demo{
	public static void main(String args[]){
		int arr[]=new int[]{2,4,1,3};
		int n=arr.length;

		for(int i=0;i<n;i++){
			for(int j=i;j<n;j++){
				for(int k=i;k<=j;k++){
					System.out.print(arr[k]+" ");
				}System.out.print("\t");
			}System.out.println();
		}
	}
}
