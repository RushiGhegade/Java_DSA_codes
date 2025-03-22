// access specifier in method overriding
// if parent method scope is large and child method scope is small then it give error
// lly parent scope is small and child scope is large then it not give error

// if private access specifier then does not overriding senario come in picture

class parent{
    
    private void fun(){
        System.out.println("in parent fun method");
    }
}
class child extends parent{

    void fun(){  // default has large access compare to private but private do's not see in child class
        System.out.println("in child fun method");
    }
}
public class program15 {
    public static void main(String[] args) {
        parent obj=new child();
        obj.fun();      //  compile time compiler does not found refferance of fun() method
    }
}
