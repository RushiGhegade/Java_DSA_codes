// Normal inner class
// static method then


class outer {
    static void fun(){
        System.out.println("in inner fun method");
    }
    class inner{
        static void gun(){
            System.out.println("in inner gun method");
        }
    }
}
public class program2 {
    public static void main(String[] args) {
        outer.fun();                             // call outer static method using class name

        outer.inner.gun();                  // call inner static method using outer.inner class

    }    
}
