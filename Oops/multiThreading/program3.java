// multithreading 
// do not override start() method of the thread class

class MyThread extends Thread{

    public void run(){
        System.out.println("in run method");
        System.out.println(Thread.currentThread());
    }
    public void start(){  // don't override start method 
       
        System.out.println("in start method");
        run();
    }

}
public class program3 {
    public static void main(String[] args) {
        MyThread obj =new MyThread();
        obj.start();
    }
}
