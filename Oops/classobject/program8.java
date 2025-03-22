// static variable and static method 

class StaticDemo{
    static int x=10;  // satic variable
    static int y=20;  

    static void display(){      // static method
        System.out.println(x);  // static variable directly access in static & nonsatic method without creating object.
        System.out.println(y);  // nonsatic variable not directly accsses in static create a obj to access 
    }
}

public class program8 {
    public static void main(String[] args) {
        StaticDemo obj=new StaticDemo();
        obj.display();
    }    
}
