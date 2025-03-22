// If array is even then print true else false

class Demo{

	boolean evenarray(int arr[],int count,int n){
		
		if(count>=2)
			return true;

		if(n==0)
			return false;

		if(arr[n-1]%2==0)
			return evenarray(arr,count+1,n-1);
		else
			return evenarray(arr,count,n-1);

	}

	public static void main(String args[]){

		int arr[]=new int[]{1,2,3,5,7,9,12};

		Demo obj=new Demo();
		boolean ans=obj.evenarray(arr,0,arr.length);
		System.out.println(ans);
	}
}
