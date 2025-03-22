class Demo {
    int x=10;
    private int y=20;
    void fun(){
        System.out.println("x="+x);
        System.out.println("y="+y);
    }
}
class program2{
    public static void main(String args[]){
        Demo obj=new Demo();
        obj.fun();
        System.out.println(obj.x);  // no error
       // System.out.println(obj.y);  // error because y has private access
       // System.out.println(x);      // can not found symbool
        //System.out.println(y);      //
    }
}