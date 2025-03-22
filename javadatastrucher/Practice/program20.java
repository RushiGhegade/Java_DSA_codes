// Find the Total sum of the SubArray
// prefixsum
class SubArraySum{
	
	public static void main(String args[]){
		
		int arr[]=new int[]{1,2,3};

		int psum[]=new int[arr.length];

		psum[0]=arr[0];
		for(int i=1;i<arr.length;i++){
			psum[i]=psum[i-1]+arr[i];
		}
		
		int allsum=0;
		for(int i=0;i<arr.length;i++){
			int sum=0;
			for(int j=i;j<arr.length;j++){
				
				if(i==0)
					sum=sum+psum[j];
				else{
					sum=sum+psum[j]-psum[i-1];
				}
			}	
			allsum=allsum+sum;		
		}
		System.out.println(allsum);
	}
}
// Using CarryForword
class Subarraysum{


	public static void main(String args[]){
		
		int arr[]=new int[]{1,2,3};

		int allsum=0;
		for(int i=0;i<arr.length;i++){			
			int sum=0;
			for(int j=i;j<arr.length;j++){
				sum=sum+arr[j];
				allsum=allsum+sum;	
			}
		}
		System.out.println(allsum);
	}
}
