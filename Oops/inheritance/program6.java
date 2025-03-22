// inheritance program 

class parent {
    int x=10;
    static int y=20;
    static {
        System.out.println("in parent static block");
    }
    parent(){
        System.out.println("in parent constructor");
    }
    void fun(){
        System.out.println(x);
        System.out.println(y);
    }
    static void gun(){
        System.out.println(y);
    }
}
class child extends parent{
    static{
        System.out.println("in child static block");
    }
    child(){
        System.out.println("in child constructor");

    }
}
public class program6 {
 public static void main(String args[]){
    child obj=new child();
    obj.fun();
    obj.gun();
 } 
}
