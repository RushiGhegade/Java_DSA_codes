// Given an array if size n 
// C : print the array of every single subarray using carray forword approch

class Demo{
	public static void main(String args[]){
		int arr[]=new int[]{2,4,1,3};
		int n=arr.length;

		for(int i=0;i<n;i++){
			int sum=0;
			for(int j=i;j<n;j++){
				sum=sum+arr[j];
				System.out.println(sum);
			}
		}
	}
}
