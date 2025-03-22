// method overloading 

public class program3 {

    void fun(int x){
        System.out.println(x);
    }
    
    void fun(float x){
        System.out.println(x);
    }

    void fun(program3 obj){
        System.out.println(obj);
    }

    public static void main(String args[]){
         program3 obj=new program3();
         obj.fun(10);

         obj.fun(12.4f);

         program3 obj1=new program3();
         obj1.fun(obj);

    }
}
