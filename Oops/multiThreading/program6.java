// priority of Thread
// getPriority() :get the priority of the thread
// setPriority() :set the Priority of the Thread

class MyThread extends Thread{
    public void run(){
        Thread obj=Thread.currentThread();
        System.out.println("Thread-0:"+obj.getPriority());
    }
}
public class program6 {
    public static void main(String args[]){
        Thread t=Thread.currentThread();
        
        System.out.println("main before :"+t.getPriority());

        MyThread obj=new MyThread();
        obj.start();

        t.setPriority(7);
        System.out.println("main after :"+t.getPriority());
    }   
}
