// Thread(String);



class MyThread extends Thread{
	MyThread(String str){
		super(str);
	}
	public void run(){

		System.out.println(Thread.currentThread().getName());
	}
}
class Main{
	public static void main(String args[]){
		
		System.out.println(Thread.currentThread().getName());
		MyThread obj=new MyThread("Rushi");
		obj.start();
	}
}
