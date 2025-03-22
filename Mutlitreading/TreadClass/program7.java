// Join
// 
class MyThread extends Thread{
	static Thread t=null;
	public void run(){
		System.out.println("In Run Method");

		try{
			t.join();
		}catch(InterruptedException e){
		
		}
		System.out.println("In Run-2 Method");

	}
}
class Main{
	public static void main(String args[])throws InterruptedException{
		
		System.out.println("Start Main Method");
		MyThread.t=Thread.currentThread();

		MyThread obj=new MyThread();
		obj.start();

		//obj.join(800,999999);
		obj.join(800);
		System.out.println("End Main Method");
	}
}
