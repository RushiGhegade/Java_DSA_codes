// Instance Block 
//  instance block is inside the constructor
//  instance block out is come first then constructor output come

public class program13 {
    int x=10;
    program13(){
        System.out.println("in constructor");
    }
    static int y=20;
    {                                              // instance block
        System.out.println("Instance Block 1");
        System.out.println(x);
        System.out.println(y);
    }
    public static void main(String args[]){
        program13 obj=new program13();

    }
    {                                               // instance block
        System.out.println("Insatance block 2");
    }
}
