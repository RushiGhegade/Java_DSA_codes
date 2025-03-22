// creating Thread using RunnableInterface

class MyThread implements Runnable{
    public void run(){
        System.out.println("in run");
        System.out.println(Thread.currentThread().getName());
    }
}
public class program5 {
    public static void main(String args[]){
        MyThread obj=new MyThread();
        Thread t=new Thread(obj);
        t.start();                // this method is thread class to  start thread use .start() hence use above line 
    }
}
