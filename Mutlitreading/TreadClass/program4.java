// Find the pririty and Set The Priority of thread

// threadSchedular not give the guarantee the low priority thread run first compare to low priority thread

class Demo extends Thread{

	public void run(){
		System.out.println("In Rum Method");
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}
}

class Main{

	public static void main(String args[]){
		Thread t=Thread.currentThread();
		t.setPriority(1);
		System.out.println(t.getPriority());
	
		Demo obj=new Demo();
		obj.setPriority(10);
		obj.start();

		for(int i=0;i<50;i++);

		System.out.println("End Main");
		

		
	}
}
