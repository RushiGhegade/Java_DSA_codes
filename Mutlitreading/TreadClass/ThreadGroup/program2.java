// Create ThreadGroup with Child ThreadGroup 
// using Thread class
//
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
		
		ThreadGroup ptg=new ThreadGroup("Principal");
		System.out.println(ptg.getParent());

		MyThread t1=new MyThread(ptg,"Manage Collage");
		MyThread t2=new MyThread(ptg,"Solve Big Problem");

		t1.start();
		t2.start();

		ThreadGroup ctg=new ThreadGroup(ptg,"HOD");
		System.out.println(ctg.getParent());

		MyThread t3=new MyThread(ctg,"manage Department");
		MyThread t4=new MyThread(ctg,"slove Department Problem");
		t3.start();
		t4.start();

	}
}
