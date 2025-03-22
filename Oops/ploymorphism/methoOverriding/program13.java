// access specifier in method overriding
// if parent method scope is large and child method scope is small then it give error
// lly parent scope is small and child scope is large then it not give error
class parent {
    public void fun(){
        System.out.println("in parent fun method");
    }
}
class child extends parent{
    
    void fun(){          // public is large scope compare to default hence it is error
         System.out.println("in child fun method");
    }
}

public class program13 {
    public static void main(String[] args) {
        parent obj=new child();
        obj.fun();
    }   
}
