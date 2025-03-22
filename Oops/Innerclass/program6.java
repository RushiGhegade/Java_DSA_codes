// method local class

class outer{
    // outer method
    static void fun(){
        System.out.println("in outer fun method");

        // method local inner class

        class inner{
            static void gun(){
                System.out.println("inside method inner class method gun");
            }
        }
        // inner obj=new inner();
        inner.gun();
    }
}
public class program6 {
    public static void main(String args[]){
        // outer obj=new outer();
        outer.fun();
    }
}
