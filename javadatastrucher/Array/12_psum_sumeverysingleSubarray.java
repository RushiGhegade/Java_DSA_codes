// Given an array of size n 
// B -> print the sum of every single subarray using prefix sum technique

class Demo{
	public static void main(String args[]){
		int arr[]=new int[]{2,4,1,3};
		int n=arr.length;

		int psum[]=new int[n];
		
		// prefix sum
		psum[0]=arr[0];
		for(int i=1;i<n;i++){
			psum[i]=psum[i-1]+arr[i];
		}

		// print sum using psum array
		int sum=0;
		for(int i=0;i<n;i++){
			for(int j=i;j<n;j++){
				if(i==0){
					sum=psum[j];
				}else{
					sum=psum[j]-psum[i-1];
				}
				System.out.println(sum);
			}
		}
	}
}
