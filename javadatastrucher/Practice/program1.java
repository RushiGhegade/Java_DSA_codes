// Count the Number Which is having atleast 1 element greter 


class Main{

	// Optimal
	int Optimal(int arr[]){

		
		int max=Integer.MIN_VALUE;

		for(int i=0;i<arr.length;i++){
			if(arr[i]>max)
				max=arr[i];
		}

		int count=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==max)
				count++;
		}	

		return (arr.length-count);
	}
	
	// Using Recursion
	int CountR(int arr[],int allcount,int n){
		
		if(n==arr.length)
			return allcount;

		int count=0;
		for(int j=0;j<arr.length;j++){
			if(arr[n]<arr[j]){
				count++;
				break;
			}				
		}

		return CountR(arr,allcount+count,n+1);
	}

	// Without Recursion
	int Count(int arr[]){
		
		int allCount=0;

		for(int i=0;i<arr.length;i++){
			int count=0;
			for(int j=0;j<arr.length;j++){
				if(arr[i]<arr[j]){
					count++;
					break;
				}
			}

			allCount =allCount+count;
		}

		return allCount;
	}

	public static void main(String args[]){
		
		int arr[]=new int[]{2,5,1,4,8,0,8,1,3,8};

		Main obj=new Main();

		int ans=obj.Optimal(arr);
		System.out.println(ans);
	}
}
