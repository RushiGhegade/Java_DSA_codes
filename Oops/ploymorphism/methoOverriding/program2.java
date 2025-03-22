
class parent {
    parent(){
        System.out.println("in parent constructor");
    }
    private void fun(){
        System.out.println("in fun");
    }
}
class child  extends parent{
    child(){
        System.out.println("in child constructor");
    }
    void gun(){
        System.out.println("in gun method");
    }
}

public class program2 {
    public static void main(String args[]){
        child obj=new child();
       // obj.fun();  parent class private  method does not show in child class
        obj.gun();
        
        parent obj1=new parent();
        //obj1.fun();                     //private access 
         //obj1.gun();                   // errror beacuse child class method does not see in parent class // error : canot find symboll
    }
}
