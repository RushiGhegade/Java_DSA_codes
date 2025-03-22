// Thread Grouping

class Demo extends Thread{
    Demo(ThreadGroup tg,String name){
        super(tg,name);
    }
    public void run(){
        System.out.println(Thread.currentThread());
    }
}
public class program14 {
    public static void main(String[] args) {

    
        
        ThreadGroup tg=new ThreadGroup("1st group");  // it give group name (1st group)
        System.out.println("GroupName"+tg.getName());   // it show group name
        System.out.println("==+"+tg.getParent());       //  it show parent of the thread
        

        Demo obj=new Demo(tg,"tread first"); //this constructor present in thread class it take threadgroup and string
        obj.start();

        Demo obj1=new Demo(tg,"tread second");
        obj1.start();

        Demo obj2=new Demo(tg,"tread thried");
        obj2.start();

        ThreadGroup cg=new ThreadGroup(tg,"hg"); // this child 
        System.out.println("+++"+tg.parentOf(tg));
        
        System.out.println("==="+cg.getName());   //
        System.out.println("==+"+cg.getParent());       // it getparent()

        Demo obj3=new Demo(tg,"child tread first");
        obj3.start();

        Demo obj4=new Demo(tg,"child tread second");
        obj4.start();
    }
}
