// ThreadGroup

class MyThread implements Runnable{

        public void run(){
                System.out.println(Thread.currentThread());
        }
}

class Main{
        public static void main(String args[]){

                ThreadGroup ptg=new ThreadGroup("vs Code");
		System.out.println(ptg.getParent());
                ThreadGroup ctg=new ThreadGroup(ptg,"File");
		System.out.println(ctg.getParent());
                MyThread obj1=new MyThread();
                MyThread obj2=new MyThread();
                MyThread obj3=new MyThread();

                Thread t1=new Thread(ctg,obj1,"New Text File");
                Thread t2=new Thread(ctg,obj1,"Text File");
                Thread t3=new Thread(ctg,obj1,"Save File");

                t1.start();
                t2.start();
                t3.start();


        }
}
