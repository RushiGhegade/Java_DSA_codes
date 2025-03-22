// Given an integer array of size n Bulid an array Rightmost of size n Rightmost of i contain the maximum for the index 0 to the index i
// Arr =[-3,6,2,4,5,2,8,-9,3,1]
// n=10
// Right_Max=[8,8,8,8,8,8,8,3,3,1]


// Right Most

// Brute Force
class Demo{
	public static void main(String args[]){
		int arr[]=new int[]{-3,6,2,4,5,2,8,-9,3,1};
		int n=arr.length;

		int temp[]=new int[n];
	
		for(int i=n-1;i>=0;i--){
			int max=Integer.MIN_VALUE;
			for(int j=n-1;j>=i;j--){
				if(arr[j]>max){
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
// TimeComplexity ->  O(N)*O(N) -> O(N*N)
// spaceComplxity -> O(N)


// Optimize
class Optimize{
	public static void main(String args[]){
		int arr[]=new int[]{-3,6,2,4,5,2,8,-9,3,1};
		int n=arr.length;
		
		int temp[]=new int[n];
		temp[n-1]=arr[n-1];
		for(int i=n-2;i>=0;i--){
			if(temp[i+1]<arr[i]){
				temp[i]=arr[i];
			}else{
				temp[i]=temp[i+1];
			}
		}

		for(int i=0;i<arr.length;i++){
			System.out.print(temp[i]+" ");
		}System.out.println();
	}
}
// TimeComplexity -> O(N)
// SpaceComplexity -> O(N)










