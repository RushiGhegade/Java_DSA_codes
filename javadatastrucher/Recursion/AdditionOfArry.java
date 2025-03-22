// Print the Addition Of the Array Using Recursion

class Demo{

	int addArray(int arr[],int n){
			
		if(n==0){
			return arr[n];
		}

		return arr[n]+addArray(arr,--n);
	}

	public static void main(String args[]){

		int arr[]=new int[]{1,2,3,4,5};

		Demo obj=new Demo();
		
		int n=arr.length-1;
		System.out.println(obj.addArray(arr,n));
	}
}
