// static and instance vallue change program

class Demo{
    int x=10;
    private int y=20;
    static int z=30;
    void display(){
        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("z="+z);
    }
}

public class program6 {
    public static void main(String args[]){
        Demo obj1=new Demo();
        Demo obj2=new Demo();
        obj1.display();

        obj1.x=100;              // x change in only obj1 
        obj2.z=90;               // z change on both obj1 & obj2 because static 

        obj1.display();
        obj2.display();
    }
}
