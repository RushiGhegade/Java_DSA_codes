// hidden this parameter 
// 

public class program3 {
    int x=10;
    program3(){                                //internalLine => program3(program3 this)
        System.out.println("in constructor");
    }
    void fun(){                                // fun(program3 this)
        System.out.println(x);
    }

    public static void main(String args[]){
        program3 obj=new program3();               //InternalLine => program3(obj)
         obj.fun();                                // fun(obj)
    }
}
