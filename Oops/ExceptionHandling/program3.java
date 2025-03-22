// Arithmatic Exception
class Demo{
    void fun(){
        System.out.println(10/0);
    }
    void gun(){
        fun();
    }
}
public class program3 {
    public static void main(String args[]){
        Demo obj=new Demo();
        System.out.println("start main");
        
        obj.gun();     // arithmetic exception

        /*try{
        obj.gun() ;   // Arithmatic Exception(Run time Exception)
        }catch(ArithmeticException e){
            
        }*/
        System.out.println("end main");
    
    }
}
