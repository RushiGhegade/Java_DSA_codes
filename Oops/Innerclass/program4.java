
// normal Inner class overview 

class outer{
    void m1(){
        System.out.println("in outer class nonstatic m1 method");
    }
    static void m2(){
        System.out.println("in static class static m2 method");
    }

    class inner{
        void callmethod(){
            outer obj=new outer();
            obj.m1();

            outer.m2();
        }
        void m1(){
            
            System.out.println("in inner  class nonstatic m1");
        }
        static void m2(){
            System.out.println("in inner class static m2");
        }

    }
}
public class program4 {
    public static void main(String args[]){
        //  for outer class 
        outer obj=new outer();
        obj.m1();
        obj.m2(); // outer.m2();

        // for inner class
        outer.inner obj1=new outer().new inner();
        obj1.m1();
        obj1.m2(); // outer.inner.m2();

    }
}
