class parent {
    int x=10;
    parent(){
        System.out.println("in parent constructor");
    }
    void access(){
        System.out.println("parent instance ");
    }
}
class child extends parent {
    int y=20;
    child(){
        System.out.println("in child constructor");
        System.out.println(x);               // no error beacuse parent class all property access bt child class
        System.out.println(y);
    }
}
public class program3 {
    public static void main(String args[]){
        child obj=new child();
        obj.access();
    }
}
