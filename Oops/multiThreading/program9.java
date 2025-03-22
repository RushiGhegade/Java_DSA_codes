// multhreding 
// 2) join ()

class Demo extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("in run ");
        }
    }
}

public class program9 {
    public static void main(String args[])throws InterruptedException{
        Demo obj=new Demo();
        obj.start();

        //obj.join();   // first run upper thread then run below 
        obj.join(1); // 1 milli second run upper method then run bellow method

        for(int i=0;i<10;i++){
            System.out.println("in main ");
        }
    }
}
