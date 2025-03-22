//Create a Thread Using Thread Class


class MyThread extends Thread{
	// Im Abel to Access the Functionality of Thread Class
	
}

class Main{
	public static void main(String args[]){
		
		MyThread obj=new MyThread(); // Thread Created
		obj.start();
		System.out.println(Thread.CurrentThread().getName());
	}
}
