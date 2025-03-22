// print Subarray which sum is maximum
// I/P = arr[-2,1,-3,4,-1,2,1,-5,4];
// O/P = [4,-1,2,1]
// time compexity -> O(N)
class Demo{
	public static void main(String args[]){
		int arr[]=new int[]{-2,1,-3,4,-1,2,1,-5,4};
		int n=arr.length;
		int max=Integer.MIN_VALUE;	
		int sum=0;
		int x=0;
		int start=0;
		int end=0;
		for(int i=0;i<n;i++){
			if(sum==0){
				x=i;
			}
			sum=sum+arr[i];

			if(sum>max){
				start=x;
				end=i;
				max=sum;
			}

			if(sum<0){
				sum=0;
			}
		}

		for(int i=start;i<=end;i++){
			System.out.print(arr[i]+" ");
		}
	}
}

