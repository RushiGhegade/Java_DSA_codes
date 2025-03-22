public class program2 {
    public static void main(String args[]){

        String str1="Rushi";                         // scp
        String str2=new String("Rushi");    // heap section

        System.out.println(System.identityHashCode(str1));  
        System.out.println(System.identityHashCode(str2));

        String str3="Rushi";                           // str1==str3   
        String str4=new String("Rushi");

        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));
    }
    
}
