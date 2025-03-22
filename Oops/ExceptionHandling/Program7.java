// handel ArithmeticException using try catch block


class program7{
    public static void main(String args[]){
        System.out.println("Start Main");
        // int a=0;
        try{
            System.out.println(10/0);                       // Risky code
            // a=10/0;
        }catch(ArithmeticException e){
            System.out.println("Exception Occure");       // handler code
        }
        // System.out.println(a);
        System.out.println("End Main");
    }
}