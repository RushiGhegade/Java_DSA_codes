// yield

class MyThread extends Thread{
	public void run(){
		System.out.println("In Run Method");
		for(int i=0;i<10;i++){
			System.out.println("In Run Method");
		}
	}
}
class Main{
	public static void main(String args[]){
		System.out.println("Start main method");

		MyThread obj=new MyThread();
		obj.start();

		Thread t=Thread.currentThread();
		t.yield();

		for(int i=0;i<10;i++){
                        System.out.println("In main Method");
                }

		System.out.println("End Main Method");
	}
}
