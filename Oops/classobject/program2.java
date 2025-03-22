// class and object basic code (dig)

class Demo{
    int x=10;             // constructor
    String str="Rushi"; //scp
    void fun(){
        System.out.println("in fun method");
        String str2="Rushi";      //scp
        String str3=new String("Rushi");// heap section
    }
}
class program2 {
    public static void main(String[] args) {
        Demo obj=new Demo();
        obj.fun();        
    }    
}
