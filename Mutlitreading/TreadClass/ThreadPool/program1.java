// Create a ThreadPool
// newFixedThreadPool();

import java.util.concurrent.*;
class MyThread implements Runnable{

	int num;
	MyThread(int num){
		this.num=num;
	}

	public void run(){
		System.out.println(Thread.currentThread()+" Start Thread"+num);

		
	}
}
class Main{
	public static void main(String args[]){
		
		ExecutorService ser=Executors.newFixedThreadPool(5);

		for(int i=0;i<5;i++){

			MyThread obj=new MyThread(i);

			ser.execute(obj);
		}
		ser.shutdown();
	}
}
