// Given an array of size n print the 
// A : print the sum of every single subarray

class Demo{
	public static void main(String args[]){
		int arr[]=new int[]{2,4,1,3};
		int n=arr.length;

		for(int i=0;i<arr.length;i++){
			for(int j=i;j<n;j++){
				int sum=0;
				for(int k=i;k<=j;k++){
					sum=sum+arr[k];
				}System.out.println(sum);
			}
		}
	}
}
