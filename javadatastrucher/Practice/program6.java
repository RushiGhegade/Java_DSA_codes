// ArraySum

class ArraySum{
	
	public static void main(String args[]){
		
		int arr[]=new int[]{1,2,3,4,5};

		int sum=0;

		int s=2;
		int e=4;

		for(int i=s;i<=e;i++)
			sum=sum+arr[i];

		System.out.println(sum);
	}
}
