//static block in inheritance

class parent{
    static int x=10;
    static {
        System.out.println("in static parent");
    }
    static void fun(){
        System.out.println(x);
    }
}
class child extends parent{
    static{
        System.out.println("in child static block");
        System.out.println(x);
        fun();
    }
}
public class program5 {
    public static void main(String[] args) {
        child obj=new child();
        obj.fun();
    }
}
