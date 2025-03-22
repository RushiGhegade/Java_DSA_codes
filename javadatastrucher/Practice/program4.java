// Second Max Element


class SecondMax{

	public static void main(String args[]){

		int arr[]=new int[]{10,2,3,4,5,6,7,8,9,1};

		int max=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;

		for(int i=0;i<arr.length;i++){
			
			if(max<arr[i]){
				smax=max;
				max=arr[i];
			}else if(smax<arr[i] && arr[i]!=max){
				smax=arr[i];
			}
		}

		System.out.println(smax);
	}
}


