// method local inner class 
// inside the class 

class program5 {
    // method in outer class
    static void m1(){
        System.out.println("in outer class m1 method");

        // method local inner class
        class inner{            
            void fun(){
                System.out.println("in method local inner class method fun");
            }
        }
        inner obj=new inner();
        obj.fun();
}
    public static void main(String args[]){
        program5 obj=new program5();
        obj.m1();
    }
    
}

