// try with multipale catch
// in mutipale catch block have child parent relation

 
// parent child not allowed in mutipale catch block
public class program10 {
    public static void main(String args[]){
        try{
            System.out.println(10/0);
        }catch(RuntimeException e){
            
        }catch(ArithmeticException e){  // ArithmeticException is child of RuntimeException hence it allredy
                                        // handel in RuntimeException
        }
    }    
}


