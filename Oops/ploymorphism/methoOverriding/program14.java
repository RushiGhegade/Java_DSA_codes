// method overriding 
// access specifier in method overriding
// if parent method scope is large and child method scope is small then it give error
// lly parent scope is small and child scope is large then it not give error

class parent {
    
    void fun(){            // public access specifier
        System.out.println("in parent fun function");
    }
}
class child extends parent{

    public void fun(){     // public has large access specifier compare to default access specifier 
        super.fun();         // call parent class fun method
        System.out.println("in child fun");
    }
}
public class program14 {
    public static void main(String args[]){
        parent obj=new child();
        obj.fun();
    }
}
