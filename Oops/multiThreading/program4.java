//  multithreading 
//  craete multipale thread (thread-0,thread-1)
class Demo extends Thread{
    public void run(){
        System.out.println("Demo :"+Thread.currentThread().getName());
    }
}
class MyThread extends Thread{
    public void run(){
        System.out.println("MyThread :"+Thread.currentThread().getName());
        Demo obj=new Demo();
        obj.start();
    }
}

public class program4 {
    public static void main(String args[]){
        System.out.println("main :"+Thread.currentThread().getName());
        MyThread obj=new MyThread();
        obj.start();
    }    
}
