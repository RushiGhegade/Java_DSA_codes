
// static , instance and variable ,  method 

class Demo{
    int x=10;
    static int y=20;
    void display(){
        System.out.println(x);  // non static access directly in nonstatic only 
        System.out.println(y);  // static access directly static and nonstatic both method
    }
    static void display1(){
        System.out.println(y);
        //System.out.println(x);           // create a object to acess in static method
    }
}

public class program9 {
    public static void main(String[] args) {
        Demo obj=new Demo();
        obj.display();
        obj.display1();  // Demo.display();  static method call class name or obj name both
        System.out.println(obj.x);
        System.out.println(Demo.y);// obj.y
    }
}
