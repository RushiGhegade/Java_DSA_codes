// Find the givem number is sorted or not



class Demo{
	
	boolean sorted(int arr[],int index,int n){

		if(index==n-1)
			return true;
		
		if(arr[index]>arr[index+1])
			return false;

		return sorted(arr,index+1,n);

	}
	public static void main(String args[]){

		int arr[]=new int[]{1,2,3,4,5,6};

		Demo obj=new Demo();

		int n=arr.length;
		boolean ans=obj.sorted(arr,0, n);
		System.out.println(ans);
	}
}
