// Static Block
// Static block run before main method it is use to initilize the static variable 

public class program10 {
    static {         // static Block
        System.out.println("static constructor");
        System.exit(0);
    }
    public static void main(String args[]){
        System.out.println("in main method ");

    }    
}
