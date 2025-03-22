// Handel the arithmatic exception

class Demo{
	public static void main(String args[]){		

		int a=10;

		int b=0;
		
		int ans=0;
		try{
			ans=a/b;
			System.out.println("Not Exceuted");
		}catch(ArithmeticException e){
			System.out.println("Enter the non zero value b");
			b=2;
			ans=a/b;
		}
		System.out.println(ans);
	}
}
