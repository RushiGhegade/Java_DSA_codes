// Handel NullpointerException using try catch 


class Demo{

	void fun(){
		System.out.println("In fun method");
	}

	public static void main(String args[]){
		
		Demo obj=new Demo();

		obj.fun();

		obj=null;

		//obj.fun();  //Exception
		
	       // Solve Exception

		try{
			obj.fun();
		}catch(NullPointerException e){
			
			obj=new Demo();      // Agian assigen the new obj
			obj.fun();

			//System.out.println("Object is null");
			//System.out.println("Exception in Thread "+Thread.currentThread().getName()+" "+ e );
		}finally{
			obj=null;         // work is done then agian null 
		}

		System.out.println("End Main");	
	}
}
