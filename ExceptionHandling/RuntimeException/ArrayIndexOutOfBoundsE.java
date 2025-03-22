// ArrayIndexOutOfBoundsException in java


class Demo {

	void fun(int arr[]){

		System.out.println(arr[2]);

		System.out.println(arr[6]);     // Exception
	}

	public static void main(String args[]){
		
		int arr[]=new int[]{1,2,3};
			
		Demo obj=new Demo();
		obj.fun(arr);
	}
}
