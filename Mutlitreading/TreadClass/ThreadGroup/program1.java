// Create a ThreadGroup with children thread

class MyThread extends Thread{

	MyThread(ThreadGroup tg,String str){
		super(tg,str);
	}

	public void run(){
		System.out.println(Thread.currentThread());
	}
}

class Main{
	
	public static void main(String args[]){
		
		ThreadGroup ptg=new ThreadGroup("Collage");

		System.out.println(ptg.getName());
		System.out.println(ptg.getParent());

		MyThread t1=new MyThread(ptg,"CS");
		MyThread t2=new MyThread(ptg,"IT");
		MyThread t3=new MyThread(ptg,"Electrical");
		
		t1.start();
		t2.start();
		t3.start();	
	}
}
