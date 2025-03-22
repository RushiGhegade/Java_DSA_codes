// find the largest sum of the subarray
// Using Prefix sum

class largestSum{
	
	public static void main(String args[]){
	

		int arr[]=new int[]{-2,1,-3,4,-1,2,1,-5,4};

		int psum[]=new int[arr.length];

		psum[0]=arr[0];

		for(int i=1;i<arr.length;i++){
			psum[i]=psum[i-1]+arr[i];
		}

		int allmax=Integer.MIN_VALUE;

		for(int i=0;i<arr.length;i++){
			int sum=0;
			for(int j=i;j<arr.length;j++){

				if(i==0){
					sum=psum[j];
				}else{
					sum=psum[j]-psum[i-1];

				}
				if(sum>allmax){
                                	allmax=sum;
                        	}	
			}
		}

		System.out.println(allmax);
	}
}


// CarryForword
class largestsum{
	
	public static void main(String args[]){
		
		 int arr[]=new int[]{-2,1,-3,4,-1,2,1,-5,4};

		 
		 int max=Integer.MIN_VALUE;
		 for(int i=0;i<arr.length;i++){
			int sum=0;
		 	for(int j=i;j<arr.length;j++){
				sum=sum+arr[j];
				if(sum>max){
					max=sum;
				}				
			}		
		 }
		 System.out.println(max);
	}
}






