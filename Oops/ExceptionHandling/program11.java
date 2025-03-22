// mutipale catch block 

// child parent relation
public class program11 {
    public static void main(String args[]){
        System.out.println("Start Main");
        try{

            System.out.println(10/0);
        }catch(ArithmeticException e){

        }catch(RuntimeException e){
            
        }catch(Exception e){

        }catch(Throwable e){

        }/*catch(Object e){ // incompatiable type object canot be converted Throwable

        }*/
        System.out.println("End Main");
    }
}
