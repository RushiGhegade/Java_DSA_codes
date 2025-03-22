// Thread Grouping

class myThread extends Thread{
    myThread(String  str){
        super(str);
    }
    myThread(){

    }
    public void run(){
        System.out.println(getName());
        // System.out.println(Thread.currentThread().getThreadGroup());
    }
}

public class program12 {
    public static void main(String args[]){
        myThread obj=new myThread("rushi");  // thrad name = rushi
        obj.start();

        myThread obj1=new myThread("laksh"); // thread name=laksh
        obj1.start();

        myThread obj2=new myThread();           // thread name=thread-0
        obj2.start();

    }
}
