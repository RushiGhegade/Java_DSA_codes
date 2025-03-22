// this  is use to call the another constructor form one constructor

public class program6 {
    program6(){
        this(10);           // call this(int x) type constructor
         System.out.println("no args constructor");
    }

    program6(int x){
        this(10,20);          // call this(int x,int y) type constructor
        System.out.println("in para-Constructor");
    }

    program6(int x,int y){
        System.out.println("in two para Constructor");
    }

    public static void main(String args[]){
        program6 obj=new program6();
    }
}
