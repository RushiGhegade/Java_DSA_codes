// Equilibrium Index


class Demo{
	// Optimal
	static int eqiIndex(int arr[]){
		
		int psum[]=new int[arr.length];

		psum[0]=arr[0];
		for(int i=1;i<arr.length;i++){
			psum[i]=psum[i-1]+arr[i];
		}

		for(int i=0;i<arr.length;i++){
			int leftsum=0;
			int rightsum=0;

			if(i!=0){
				leftsum=psum[i-1];
				rightsum=psum[arr.length-1]-psum[i];
			}else{
				rightsum=psum[arr.length-1]-psum[i];
			}

			if(leftsum==rightsum){

				return i;
			}


		}
		return -1;
	}
	// BruteForce  ==> O(n^2)
	static int index(int arr[]){
		
		for(int i=0;i<arr.length;i++){

			int leftsum=0;
			int rightsum=0;
			
			for(int j=0;j<i;j++){
				leftsum=leftsum+arr[j];
			}

			for(int j=i+1;j<arr.length;j++){
				rightsum=rightsum+arr[j];
			}

			if(leftsum==rightsum)
				return i;			
		}
		return -1;
	}

	public static void main(String args[]){
		
		int arr[]=new int[]{1,2,3,2,1};

		int ans=index(arr);
		System.out.println(ans);

		int ans1=eqiIndex(arr);
		System.out.println(ans1);
	}
}
