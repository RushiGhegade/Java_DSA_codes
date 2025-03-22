// find the ThreadName And Set The Thread Name;
// getName();  
// setName();


class MyThread extends Thread{

	public void run(){
	//	System.out.println("In Run Method");
		Thread t=Thread.currentThread();
		//t.setName("Rushi");
		System.out.println(t.getName());
	}
}

class Demo{
	public static void main(String args[]){
		Thread t=Thread.currentThread();
		System.out.println(t.getName());  // Main
		
		MyThread obj=new MyThread();
	
		obj.start();
	        		
		Thread t1=Thread.currentThread();
                System.out.println(t1.getName());  // Main
		
		obj.setName("RushiGhegade");
	}
}



