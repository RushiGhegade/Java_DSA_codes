// StringOutOfBoundsException in java



class Demo{


	void fun(String str){
		
		System.out.println(str.charAt(3));

		System.out.println(str.charAt(7)); // Exception
	}

	public static void main(String args[]){
		
		String str="Rushi";

		Demo obj=new Demo();

		obj.fun(str);
	}
}
