class parent 
{
    void fun(){
        System.out.println("in parent fun method");
    }
}
class child extends parent{
    void fun(){
        super.fun();
        System.out.println("in child fun method");
    }
}
public class program4 {
    public static void main(String[] args) {
        child obj=new child();
        obj.fun();
    }
}
