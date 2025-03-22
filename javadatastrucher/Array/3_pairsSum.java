// given an array of size n return the count of pairs(i,j) with arr[i]+arr[j]=k
// arr[3,5,2,1,-3,7,8,15,6,13];
// n=10;
// k=10;
// note i!=j


class Demo{
	public static void main(String args[]){
		int arr[]=new int[]{3,5,2,1,-3,7,8,15,6,13};
		int n=10;
		int k=10;
		int count=0;
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length;j++){       // for(int j=i+1;j<arr.length;j++)
				if(i!=j){
					if(arr[i]+arr[j]==k){
						count++;
					}
				}
			}
		}
		System.out.println(itr);
		System.out.println(count);
	}
}

// Time Complexity => O(N) * O(N) => O(N^2)
