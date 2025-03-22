// given an array of size find the second largest element 


class Demo{
	public static void main(String args[]){
		int arr[]=new int[]{8,4,1,3,1,2,6,7};
		
		int max=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;

		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				smax=max;
				max=arr[i];
			}else if(arr[i]>smax && arr[i]!=max){
				smax=arr[i];
			}
		}
		System.out.println("Smax => "+smax);
	}
}
