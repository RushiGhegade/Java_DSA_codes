// garbeg collector

class Demo{
    String name=null;
    Demo(String name){
        this.name=name;
    }
    public String toString(){
        return name;
    }

    public void finalize(){
        System.out.println("notify");
    }
    
}
public class program4 {
    public static void main(String[] args) {
        Demo obj=new Demo("Rushi");
        Demo obj1=new Demo("abhii");
        Demo obj2=new Demo("shri");

        System.out.println(obj);
        System.out.println(obj1);
        System.out.println(obj2);

        obj1=null;

        
    }
}
