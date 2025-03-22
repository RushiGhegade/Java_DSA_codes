// deas lock

class Demo extends Thread{
    static Thread nmName;
    public void run(){
        try{
            nmName.join(10000);
        }catch(InterruptedException e){

        }
        int i=0;
        while(i<10){
            System.out.println("in run");
            i++;
        }
        System.out.println("+++++++"+getName());
        
    }
    Demo(String name){
        super(name);
    }
}

class program15{
    public static void main(String args[])throws InterruptedException{
        Demo.nmName=Thread.currentThread();

        Demo th=new Demo("rushi");
        th.start();
        th.join(10000);
        int i=0;
        while(i<10){
            System.out.println("in main");
            i++;
        }
        
    }
}