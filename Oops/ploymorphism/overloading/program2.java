
// method overloading return type 


public class program2 {

    void fun(int x){ 
        System.out.println(x);
    }

    int fun(int y){     // return type does not matter overloading  
        return y;
    }

    public static void main(String args[]){
        program2 obj=new program2();
        obj.fun(12);
    }
}


// in methos overlodaing return type doesnot matter 