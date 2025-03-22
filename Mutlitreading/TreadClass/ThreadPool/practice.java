class Demo implements Runnable {
		
	public void run(){
			
		System.out.println(Thread.currentThread());
	}
}


class Main{
	
	public static void main(String args[]){
		
		ThreadGroup pth=new ThreadGroup("Rushi");

		Demo obj=new Demo();

		Thread t=new Thread(pth,obj);

		t.start();

	}
}
