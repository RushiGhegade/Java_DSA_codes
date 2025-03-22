class Demo{
	
	public static void main(String args[]){
		
		int arr[]=new int[]{2,7,11,15};
		int target=9;

		int psum[]=new int[arr.length];
		psum[0]=arr[0];

		for(int i=1;i<arr.length;i++){
			psum[i]=psum[i-1]+arr[i];
		}
		int s=0;
		int e=0;
		for(int i=0;i<arr.length;i++){
			for(int j=i;j<arr.length;j++){

				if(i==0){
					if(psum[j]==target){
						s=i;
						e=j;
					}
				}else{
					int ans=psum[j]-psum[i-1];
					if(ans==target){
						s=i;
						e=j;
					}
				}
			}
		}

		System.out.println(s+" "+e);
	}
}
