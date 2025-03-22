// Normal inner class
// call outer class method in inner class

class outer{
    void fun(){
        System.out.println("in outer fun");
    }

    static void m1(){
        System.out.println("in static outer m1");
    }

    class inner{
        void gun(){

            outer obj=new outer();                // call outer class nonstatic method in inner class 
            obj.fun();
             
            outer.m1();                           // call outer class static method in inner class

            System.out.println("in inner gun");
        }
    }
}
public class program3 {
    public static void main(String args[]){
        outer.inner obj=new outer().new inner();
        obj.gun();
    }

}
