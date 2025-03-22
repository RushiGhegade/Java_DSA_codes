// method hidding 
// if parent class and child class have same static method then this senario calles as method hidding 


class parent {
    static void fun(){
        System.out.println("in parent static fun ");
    }
}
class child extends parent{

    static void fun(){
        System.out.println("in child static fun");
    }
}
public class program17 {
    public static void main(String args[]){
        parent obj=new child();
        obj.fun();

        parent obj1=new parent();
        obj1.fun();

        child obj2=new child();
        obj2.fun();
    }
}
