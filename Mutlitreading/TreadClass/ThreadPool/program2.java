// Create a ThreadPool 
// new SingleThreadPool();
import java.util.concurrent.*;
class MyThread implements Runnable{
	int num;
	MyThread(int num){
		this.num=num;
	}
	public void run(){
		System.out.println(Thread.currentThread()+" start run "+num);
	}
}

class Main{
	public static void main(String args[]){

		ExecutorService ser=Executors.newSingleThreadExecutor();

		for(int i=0;i<5;i++){
			
			ser.execute(new MyThread(i));
		}

		ser.shutdown();
	}
}
