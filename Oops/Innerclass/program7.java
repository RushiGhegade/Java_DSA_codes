// static inner class 

class outer{

    void fun(){
        System.out.println("in fun method");
    }
    static class inner{
        inner(){
            System.out.println("in inner class constructor");
        }
        static void gun(){
            System.out.println("in static inner class gun method");
        }
    }
}
class program7{
    public static void main(String args[]){
        outer.inner obj2=new outer.inner();
        obj2.gun();

        outer.inner.gun();
    }
}