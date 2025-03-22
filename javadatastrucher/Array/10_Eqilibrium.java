// Euilibrium index of array
// find the equilibrium index of array

// brute Force

class Demo{
	public static void main(String args[]){
		int arr[]=new int[]{-7,1,5,2,-4,3,0};
	
		int n=arr.length;
		int flag=0;
		for(int i=0;i<n;i++){
			int rsum=0;
			int lsum=0;

			// left sum
			for(int j=0;j<i;j++){
				lsum=lsum+arr[j];
			}

			// Right sum
			for(int j=i+1;j<n;j++){
				rsum=rsum+arr[j];
			}

			if(rsum==lsum){
				flag=1;
				System.out.println(arr[i]+"index :"+i);
			}
		}
		
		if(flag==0){
			System.out.println("-1");
		}	
	}
}

// Optimize
class Optimize{
	public static void main(String args[]){
		int arr[]=new int[]{11,22,33,44,55};

		int n=arr.length;
		int flag=0;
		int temp[]=new int[n];
		temp[0]=arr[0];
		for(int i=1;i<arr.length;i++){
			temp[i]=temp[i-1]+arr[i];
		}
		for(int i=0;i<arr.length;i++){
			int lsum=0;
			int rsum=0;
	
			if(i==0){
				rsum=temp[n-1]-temp[i];	
			}else{
				lsum=temp[i-1];
				rsum=temp[n-1]-temp[i];
			}

			if(lsum==rsum){
				flag=1;
				System.out.println(arr[i]);
			}
		}

		if(flag==0){
			System.out.println("-1");
		}
	}
}















