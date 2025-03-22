// Stop
// it Stop the exceution of thread

class MyThread extends Thread{

	public void run(){
		System.out.println("In Rum Method");
	}
}

class Main{
	public static void main(String args[]){
		
		System.out.println("Start Main Method");
		MyThread obj=new MyThread();
		obj.stop();
		obj.start();
		System.out.println("End Main Method");	
		//obj.start();	
	}
}
