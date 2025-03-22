class Run implements Runnable{
	public void run(){
		System.out.println(Thread.currentThread());
	}
}
/*
class mythread extends Thread{
	mythread(ThreadGroup tg,String str){
		super(tg,str);
	}
	public void run(){
		System.out.println(Thread.currentThread());
	}
}
*/
class Demo{

	public static void main(String args[]){

		ThreadGroup pt=new ThreadGroup("India");
		Run obj=new Run();
		Run obj1=new Run();
		Thread t1=new Thread(pt,obj,"maharastra");
		Thread t2=new Thread(pt,obj,"GOA");
		t1.start();
		t2.start();
		/*ThreadGroup pt=new ThreadGroup("India");
		mythread t1=new mythread(pt,"GOA");
		mythread t2=new mythread(pt,"maharastra");
		t1.start();
		t2.start();

		System.out.println("Indial p:"+pt.getParent());

		ThreadGroup ct=new ThreadGroup(pt,"pakistan");
		mythread t3=new mythread(ct,"karachi");
		mythread t4=new mythread(ct,"lahor");
		t3.start();
		t4.start();

		System.out.println("pakistan p:"+ct.getParent());*/
	}
}
