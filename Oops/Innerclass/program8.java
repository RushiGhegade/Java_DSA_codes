// static inner class 

class outer{

    static void fun(){
        System.out.println("in fun method");
    }
    static class inner{       

        static void gun(){

            outer obj=new outer();
            obj.fun();      // outer.fun();
            
            System.out.println("in static inner class gun method");
        }
    }
}
class program8{
    public static void main(String args[]){
        outer.inner obj2=new outer.inner();
        obj2.gun();

        outer.inner.gun();
    }
}