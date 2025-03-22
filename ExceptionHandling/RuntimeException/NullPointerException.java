// NullPointerException in java

class Demo{

	void Fun(){
		System.out.println("In fun Method");
	}

	public static void main(String args[]){
		
		Demo obj=new Demo();

		obj.Fun();

		obj=null;      // make object null;

		obj.Fun();
	}
}
