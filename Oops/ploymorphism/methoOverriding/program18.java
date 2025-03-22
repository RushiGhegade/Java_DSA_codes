// final in method overriding 


class parent {
    void fun(){       // final void fun() error : because final method we cant change it is final hence 
        System.out.println("in parent fun");
    }
}
class child extends parent{
    final void fun(){
        System.out.println("in child fun");
    }
}
public class program18 {
    public static void main(String[] args) {
        parent obj=new child();
        obj.fun();

        parent obj1=new parent();
        obj1.fun();
    }
}
