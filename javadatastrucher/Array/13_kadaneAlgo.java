//find Maximum subarray sum using kadane Algorithm

class maxsum{
	public static void main(String args[]){
		int arr[]=new int[]{-2,1,-3,4,-1,2,1,-5,4};
		int n=arr.length;
		int max=Integer.MIN_VALUE;

		int sum=0;
		for(int i=0;i<n;i++){
			// 1) find sum
			sum=sum+arr[i];
			
			// 2) find maxsum
			if(sum>max){
				max=sum;
			}

			// 3) sum is negetive then do sum=0;
			if(sum<0){
				sum=0;
			}
		}
		System.out.println(max);
	}
}
// Time Compexity -> O(N)
// space Complexity --> O(1)


