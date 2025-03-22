// Concurency method in thread class
// 1) sleep
// 2) join
// 3) yield

// 1) sleep() : this method is use to sleep the thread for partucular time
class Demo extends Thread{
    public void run(){
        System.out.println("run method :"+Thread.currentThread().getName());
        for(int i=0;i<10;i++){
            try{
                Thread.sleep(1000); // in sleep method it will stop the jvm hence will must define the exception 
            }catch(InterruptedException e){
                
            }
            System.out.println("in Run method");
        }
    }
}
public class program8 {
    public static void main(String args[])throws InterruptedException{
        System.out.println(" main"+Thread.currentThread());
        Demo obj=new Demo();
        obj.start();
        for(int i=0;i<10;i++){
            Thread.sleep(1000);
            System.out.println("im main method");
        }

    }
}
