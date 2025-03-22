// Sleep();

class MyThread extends Thread{
	
	public void run(){
		System.out.println("In Run Method");
	}
}

class Main{
	public static void main(String args[])throws InterruptedException{
		System.out.println("Start main method");
			
		MyThread obj=new MyThread();
		obj.start();

		Thread t=Thread.currentThread();
		
		t.sleep(900);
		
		System.out.println("End Main Method");
	}
}
