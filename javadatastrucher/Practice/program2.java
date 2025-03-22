// Find the pair Of the number (arr[i]+arr[j]==k)

class Main{
	
	// Optimal
	int Optimal(int arr[],int k){

		int count=0;

		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]+arr[j]==k){
					count++;
				}
			}
		}

		return count*2;
	}

	//Brute Force Approch
	int CountPair(int arr[],int k){  // O(n)
		
		int count=0;

		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(i!=j){
					if(arr[i]+arr[j]==k)
						count++;
				}
			}
		}

		return count;

	}

	public static void main(String args[]){

		int arr[]=new int[]{3,5,2,1,-3,7,8,15,6,13};
		int k=10;

		Main obj=new Main();

		int ans=obj.Optimal(arr,k);
		System.out.println(ans);
	}
}
