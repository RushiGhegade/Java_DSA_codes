// InterruptedException 

public class program12 {
    public static void main(String[] args) {
        System.out.println("Start Main");
        for(int i=0;i<10;i++){
            System.out.println("Start Loop");
            try{
                Thread.sleep(2000);
            }catch(RuntimeException e){  // compliler ignore becuse this error come after comilation hence 

            }catch(InterruptedException e){ // 

            }
        }
        System.out.println("End Main");
    }
}





/*public static void main(String args[])throws InterruptedException{
        Thread.sleep(1000);                                       // Handel using throws 
}*/
