
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class Myclass implements Runnable{
    public void run(){
        System.out.println("start run");
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){

        }
        System.out.println("end run");
    }
}

class pro{
    public static void main(String args[]){

        ExecutorService ser=Executors.newFixedThreadPool(2);
        Myclass obj=new Myclass();
        for(int i=0;i<10;i++){
            ser.execute(obj);
        }
        ser.shutdown();
    }
}