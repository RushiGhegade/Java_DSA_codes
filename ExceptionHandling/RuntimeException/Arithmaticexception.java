// Arithmatic Exception in java



class Demo{

	int Fun()throws ArithmeticException{

		int a=10;
		int b=0;

		int ans=a/b;

		return ans;		
	}
	
	public static void main(String args[]){

		Demo obj=new Demo();

		obj.Fun();

	}
}
