// super in inheritance 

class parent{
    int x=10;
    static int y=20;
    parent(){
        System.out.println("in parent constructor");
    }
}
class child extends parent{
    int x=30;
    static int y=40;
    child(){
        System.out.println("in child constructor");
    }
    void access(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(super.x); // super is use to call the parent class
        System.out.println(super.y);
    }
}
public class program7 {
    public static void main(String[] args) {
        child obj=new child();
        obj.access();
    }
}
