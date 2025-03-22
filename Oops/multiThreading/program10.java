// multithreading 
//join method
// dead lock condition 
class Demo extends Thread{
    static Thread nmMain =null;
    public void run(){
        try {
            nmMain.join();    // call nmMain type thread 
        } catch (InterruptedException e) {
            
        }
        System.out.println("in run method");
        
    }
}
public class program10 {
    public static void main(String args[])throws Exception{
        Demo.nmMain=Thread.currentThread();

        Demo obj=new Demo();
        obj.start();

        // obj.join();  // it create deadlock condition it call upper thread and upper join(thread-0) call lower thread(main)
        obj.join(2000);
        System.out.println("in main thread");
    }
}
