// Handel array index out of bounds exception

class Demo{
	
	public static void main(String args[]){
		
		int arr[]={1,2,3,4};

		System.out.println(arr[2]);

		try{
			System.out.println(arr[9]);
		}catch(ArrayIndexOutOfBoundsException e){
			
			System.out.println("Exception in Thread "+Thread.currentThread().getName()+" "+e);
			e.printStackTrace();
		}
	}
}
