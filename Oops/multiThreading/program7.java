//setName(String) : it use to set the name of the thread
//getName()       : it is use to get the name of the thread

class MyThread extends Thread{
    public void run(){
        Thread t=Thread.currentThread();
        System.out.println("tread-0 before:"+getName());
        t.setName("rushi");
        System.out.println();
        System.out.println("tread-0 after:"+getName());
    }
}
public class program7 {
    public static void main(String[] args) {
        MyThread obj=new MyThread();
        obj.start();
        // obj.start();      /// don't call function agian
    }
}
