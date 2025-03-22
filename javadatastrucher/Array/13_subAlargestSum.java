// Given an integer array of size N
// Find the contiguos subarray which has larget sum and return its sum
//  I/P = arr[-2,1,-3,4,-1,2,1,-5,4]

// 1) brute force
class BruteForce{
	public static void main(String args[]){
		int arr[]=new int[]{-2,1,-3,4,-1,2,1,-5,4};
		int n=arr.length;
		int max=Integer.MIN_VALUE;

		for(int i=0;i<n;i++){
			for(int j=i;j<n;j++){
				int sum=0;
				for(int k=i;k<=j;k++){
					sum=sum+arr[k];
				}
				if(sum>max){
					max=sum;
				}
			}
		}

		System.out.println(max);
	}
}
// Time Compexity -> O(N^3)
// Space Complexity -> O(1)

// 2) using Prefix Sum
class prefixSum{
	public static void main(String args[]){
		int arr[]=new int[]{-2,1,-3,4,-1,2,1,-5,4};
		int n=arr.length;
		int max=Integer.MIN_VALUE;

		int temp[]=new int[n];
		temp[0]=arr[0];	
		// prefix sum
		for(int i=1;i<n;i++){
			temp[i]=temp[i-1]+arr[i];
		}

		
		// find maxsum sub array
		for(int i=0;i<n;i++){
			int sum=0;
			for(int j=i;j<n;j++){
				if(i==0){
					sum=temp[j];
				}else{
					sum=temp[j]-temp[i-1];
				}
				if(sum>max){
					max=sum;
				}

			}
		}
		System.out.println(max);
	}
}
// Time Complexity --> O(N^2)
// Space Complexity -->  O(N);

// 3) using carray Forword Approch
class CarrayFor{
	
	public static void main(String args[]){
		int arr[]=new int[]{-2,1,-3,4,-1,2,1,-5,4};
		int n=arr.length;
		int max=Integer.MIN_VALUE;

		for(int i=0;i<n;i++){
			int sum=0;
			for(int j=i;j<n;j++){
				sum=sum+arr[j];
				if(sum>max){
					max=sum;
				}
			}
		}
		System.out.println(max);
	}
}	
// Time Complexity --> O(N^2)
// Space Complexity --> O(1)

















