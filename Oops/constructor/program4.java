// all instance method have hidden this parameter 

public class program4 {
    int x=10;
    program4(){                              // program4(program4 this)
        System.out.println("in constructor");
        System.out.println(this);
        System.out.println(this.x);
    }
    void fun(){                             // fun(program4 this)
        System.out.println("in fun method ");
        System.out.println(this);
        System.out.println(this.x);
    }
    public static void main(String[] args) {
        program4 obj=new program4();    //program4(obj) =>obj =1000
        obj.fun();                       // fun(obj)
        System.out.println(obj);
    }
}
