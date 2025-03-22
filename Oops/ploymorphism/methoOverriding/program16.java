// method overriding 
// static access specifier in method overriding 
// static method is not come in overriding senario

class parent {
    static void fun(){
        System.out.println("in parent fun");
    }
}
class child extends parent{
     void fun(){                      // static method canot override 
        System.out.println("in child fun method");
    }
}
public class program16 {
    public static void main(String args[]){
        child obj=new child();
        obj.fun();

    }
}
