// method overriding 
// if return type is covarriant then there have parent child relation

class parent {
    
    Object fun(){                    // object class is parent of all class 
        System.out.println("in parent fun");
        return new Object();
        //Object obj=new Object();
        //return obj;        
    }
}
class child extends parent{

    String fun(){                 // string parent is object class hence its covarriant return type it is true 
        System.out.println("in child fun method");
        return "rushi";                          // return new String("Rushi");
    }
}
public class pogram13 {
    public static void main(String args[]){
        child obj=new child();
        obj.fun();
    }
}
