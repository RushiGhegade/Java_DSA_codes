// Create ThreadGroup with Child ThreadGroup
// using Runnable Interface


class MyThread implements Runnable{
	public void run(){
		System.out.println(Thread.currentThread());
	}
}

class Main{
	public static void main(String args[]){
		
		ThreadGroup ptg=new ThreadGroup("Class A");

		MyThread obj1=new MyThread();
		MyThread obj2=new MyThread();

		Thread t1=new Thread(ptg,obj1,"One");
		Thread t2=new Thread(ptg,obj2,"Two");

		t1.start();
		t2.start();

		ThreadGroup ctg=new ThreadGroup(ptg,"Class B");

		MyThread obj3=new MyThread();
		MyThread obj4=new MyThread();

		Thread t3=new Thread(ctg,obj3,"A");
		Thread t4=new Thread(ctg,obj4,"B");

		t3.start();
		t4.start();
	}
}
