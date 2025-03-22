// multiThreading (REAL TIME EXAMPLE implemething Runnable)

class myThread implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread());
        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            System.out.println(e.toString());
        }
    }
}
public class program17 {
    public static void main(String[] args) {
        
        ThreadGroup pt=new ThreadGroup("India"); 
        
        myThread obj1=new myThread();
        myThread obj2=new myThread();
        Thread t1=new Thread(pt,obj1,"Maharastra");
        Thread t2=new Thread(pt,obj2,"Goa");
        t1.start();
        t2.start();

        ThreadGroup ct=new ThreadGroup(pt,"Pakistan");
        myThread obj3=new myThread();
        myThread obj4=new myThread();
        Thread t3=new Thread(ct,obj3,"karachi");
        Thread t4=new Thread(ct,obj4,"lahor");
        t3.start();
        t4.start();

        ThreadGroup ct2 =new ThreadGroup(pt,"Banglore");
        myThread obj5=new myThread();
        myThread obj6=new myThread();
        Thread t5=new Thread(obj5);
        Thread t6=new Thread(obj6);
        t5.start();
        t6.start();

        System.out.println(pt.activeCount());
        System.out.println(pt.activeGroupCount());
    }
}
