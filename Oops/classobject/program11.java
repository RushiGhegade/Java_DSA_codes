// multipale static block combine together


public class program11 {
    int x=10;
    static int y=20;
    static void fun(){
        System.out.println("static fun method");
    }
    static {
        System.out.println("in static block 1");
        System.out.println(y);               // static variable direct access
        program11 obj=new program11();
        System.out.println(obj.x);          // for nonsatic make obj
        fun();                              // static methos direct access
    }
    public static void main(String[] args) {
        
    }
    
    static {
        System.out.println("in static block 2");
    }
}
