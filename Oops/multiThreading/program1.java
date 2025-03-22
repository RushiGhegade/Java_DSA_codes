// creating thread using (extending) thread class 

class MyThread extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("in run");
        }
    }
}

class program1{
    public static void main(String args[]){
        MyThread obj=new MyThread();          // Create Thread
        obj.start();                         // thread actully start here
        for(int i=0;i<10;i++){
            System.out.println("in main");
        }
    }
}