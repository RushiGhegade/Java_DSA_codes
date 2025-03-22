// static variable method is a class variable it does not write inside any mthod or block

public class program12 {
    static int x=10;
    
    static{
       // static int y=10;        // doen't write static varable,method   inside static block they give error; 
       System.out.println("in  satic block");

     }

     static void fun(){
        //static int z=30;       //  doen't write static varable,method   inside static method they give error; 
     }
     void gun(){
        //static int x=20;       // doen't write static varable,method   inside nonstatic method they give error;
        
     }
    
}
