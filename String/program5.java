public class program5 {
    public static void main(String args[]){

        String str1="Rushi";                                   // scp   
        String str2="Ghegade";                                // scp

        System.out.println(str1+str2);

         String str3="RushiGhegade";                        // scp
        String str4=str1+str2;                              // when opration is perform run time then object is
                                                            // become heap Section
                                                            
        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));

    }
}
