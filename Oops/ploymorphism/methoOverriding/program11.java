class Demo{
    void fun(Object obj){
        System.out.println("object");
    }
    void fun(String str){
        System.out.println("String");
    }
}

public class program11 {
    public static void main(String[] args) {
        Demo obj=new Demo();
        obj.fun("Rushi");                // String  function match
 
        obj.fun(new StringBuffer());           // object function match because object is parent all

        obj.fun(null);                 // child match 
    }    
}
