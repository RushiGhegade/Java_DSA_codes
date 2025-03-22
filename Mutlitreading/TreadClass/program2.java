// create thread and find thread name;
// currentThraed();
class Demo extends Thread{
	public void run(){

		Thread t=Thread.currentThread();
		System.out.println(t);
	}
}

class MyThread extends Thread{

	public void run(){
		//System.out.println(Thread.currentThread().getName());
		Thread t=Thread.currentThread();
		System.out.println(t);

		Demo obj=new Demo();
		obj.start();
	}
}
class Main{
	public static void main(String args[]){
		System.out.println(Thread.currentThread().getName());

		MyThread obj=new MyThread();
		obj.start();
	}
}	
