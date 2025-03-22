// RunnableInterface in lambda Function



class Demo{

	public static void main(String args[]){
		Runnable obj=()->{			
				System.out.println("In Run Method");			
		};

		Thread obj1=new Thread(obj);
		obj1.start();
	}
}i
