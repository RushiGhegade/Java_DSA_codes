// Multithreading 
// sleep method in mutithreading it use to sleep the thread for sertain time (give time in mm sec)

class MyThread extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            try{         // in run method we only use try catch block we can't use throws beacuse run method is 
                         // in the  thread class in thread class it not throw exception hence child class not throw 
                Thread.sleep(2000);   
            }catch(InterruptedException e){

            }
            System.out.println("in run method");
        }
    }
}
public class program2 {
    public static void main(String args[])throws InterruptedException{
        MyThread obj=new MyThread();
        obj.start();
        for(int i=0;i<10;i++){
            Thread.sleep(1000);       // stop 1sec
            System.out.println("in main thread");
        }
    }
}
