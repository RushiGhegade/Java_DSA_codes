// Given an integer array of size n Bulid an array leftmost of size n leftmost of i contain the maximum for the index 0 to the index i 
// Arr =[-3,6,2,4,5,2,8,-9,3,1]
// n=10
// left_Max=[-3,6,6,6,6,6,8,8,8,8]

// Left Max

// brute force

class Demo{
	public static void main(String args[]){
		int arr[]=new int[]{-3,6,2,4,5,2,8,-9,3,1};
		int n=arr.length;
		int temp[]=new int[n];

		for(int i=0;i<n;i++){
			int max=Integer.MIN_VALUE;
			for(int j=0;j<=i;j++){
				if(max<arr[j]){
					max=arr[j];
				}
			}
			temp[i]=max;
		}

		for(int i=0;i<arr.length;i++){
			System.out.print(temp[i]+" ");
		}System.out.println();
	}
}
// Time Complecity -> O(N)*O(N) -> O(N^2)
// space complexity -> O(N)


// optimize approch 

class optimize{
	public static void main(String args[]){
		int arr[]=new int[]{-3,6,2,4,5,2,8,-9,3,1};
		int n=arr.length;

		int temp[]=new int[n];
		temp[0]=arr[0];
		for(int i=1;i<n;i++){
			if(temp[i-1]<arr[i]){
				temp[i]=arr[i];
			}else{
				temp[i]=temp[i-1];
			}
		}

		for(int i=0;i<n;i++){
			System.out.print(temp[i]+" ");
		}System.out.println();
	}
}
// Time complexity -> O(N)
// Space Complexity -> O(N)



















