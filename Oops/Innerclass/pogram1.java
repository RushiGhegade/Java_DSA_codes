// Normal inner class
// basic format

class outer {                                              // make outer class
    void fun(){                                           // outer mehtod
        System.out.println("in outer fun");
    }
    class inner{                                           // inner class
        void gun(){                                        // inner method
            System.out.println("in inner gun method");
        }
    }
}

class program1{
    public static void main(String args[]){
        outer obj=new outer();                         // outer class object
        obj.fun();                                    // class only outer class method using obj

        outer.inner obj1=new outer().new inner();     // make inner class object to call inner class method
        obj1.gun();
    }
}