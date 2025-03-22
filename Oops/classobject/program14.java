// static and instance block 

public class program14 {
    int x=10;
    static int y=20;
    
    program14(){
        System.out.println("in constructor");
    }
    static {
        System.out.println("in static block 1");
    }
    {
        System.out.println("in instance block 1");
    }

    public static void main(String[] args) {
        program14 obj=new program14();
    }

    static {
        System.out.println("in static block 2");
    }
    {
        System.out.println("in instance block 2");
    }
}
