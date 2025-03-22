// multiThreading  (REAL TIME EXAMPLE ) 
// .activeCount() : how many thread active of this parent Thread
// .activeGroupCount() : how many group uder parent group
class myThread extends Thread{
    myThread(ThreadGroup tg,String str){
        super(tg,str);
    }

    public void run(){
        System.out.println(Thread.currentThread());
        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            System.out.println(e.toString());// exception and discription
        }
    }
}

public class program16 {
   public static void main(String args[]){

    ThreadGroup tg=new ThreadGroup("India"); // create group india
    myThread t1=new myThread(tg,"Maharastra");    // under (India)Group is t1 Thread
    myThread t2=new myThread(tg,"GOA");           // under (India)Group is t2 Thread
    t1.start();
    t2.start();

    ThreadGroup ct=new ThreadGroup(tg,"pakistan");  // create a child(pakistan) group for india
    myThread t3=new myThread(ct,"karachi");       // create thread under pakistan t3
    myThread t4=new myThread(ct,"lahor");         // create thread under pakistan t3
   t3.start();
   t4.start();

   ThreadGroup ct2=new ThreadGroup(tg,"Banglore"); // create a another child group(Banglor) for India
   myThread t5=new myThread(ct2,"Dhoka");        // create thread under Banglore t5
   myThread t6=new myThread(ct2,"Mirpur");      // create thread under Banglore t6
   t5.start();
   t6.start();

   System.out.println(tg.activeCount());             // total no of thread active under tg
   System.out.println(tg.activeGroupCount());        // total no of active group under tg

   } 
}
