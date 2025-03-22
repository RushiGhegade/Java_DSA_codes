// yield method in multiThreading 
// yelid method is use to throw the main methos running possition to the read to run possition and then prioritywise cpu give to process
// it not mostly use

class Demo extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}

class program11{
    public static void main(String args[]){
        Demo obj=new Demo();
        obj.start();

        obj.yield();//

        System.out.println(Thread.currentThread().getName());
    }
}
