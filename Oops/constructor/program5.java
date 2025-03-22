// multipale constructor 

public class program5 {
  int x=10;
  program5(){                                        // program5(program5 this)
    System.out.println("in no-args constructor"); 
  }
  
  program5(int x){                                  // program5(program5 this,int x);
    System.out.println("in para constructor");
  }
  public static void main(String args[]){
    program5 obj=new program5();        // program5(obj)
    program5 obj1=new program5(10);   // program5(obj1,10)
  }
}
