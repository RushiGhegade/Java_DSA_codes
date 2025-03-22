// thread pool
// Executors

import java.util.concurrent.*;

class Demo implements Runnable{
    static ThreadGroup nm;

    int num;
    Demo(int num){
        this.num=num;
    }
    public void run(){
        System.out.println(Thread.currentThread()+"start Thread :"+num);
        dailyTask();
        System.out.println(Thread.currentThread()+"End Thread : "+num);
    }
    void dailyTask(){
        System.out.println("group name"+Thread.currentThread().getThreadGroup());
        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){

        }
    }
}

public class program18 {
    public static void main(String args[]) {
        ExecutorService ser=Executors.newFixedThreadPool(2);

        for(int i=0;i<10;i++){
            Demo obj=new Demo(i);
            ser.execute(obj);
        }
    }   
}
