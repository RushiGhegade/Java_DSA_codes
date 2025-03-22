// static block in inheritance
class parent{
    static{
        System.out.println("in parent static block");
    }
}
class child extends parent{
    static{
        System.out.println("in child class static block");
    }
}
public class program4 {
    public static void main(String[] args) {
        child obj=new child();
    }
}
