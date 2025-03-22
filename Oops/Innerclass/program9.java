// Annonymous Inner Class

class Demo{

}
public class program9 {
    public static void main(String args[]){

        Demo obj=new Demo(){
            void fun(){
                System.out.println("in Annonymus inner class");
            }
        };
        obj.fun()
        ;
    }
}
