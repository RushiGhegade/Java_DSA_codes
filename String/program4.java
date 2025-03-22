public class program4 {
    public static void main(String args[]){

        String str="Rushi";              // SCP (String Constant Pool)    1510467688
                
        String str1=str;                 // scp                           1510467688

        String str2=new String(str1);   // heapSection                    1995265320

        System.out.println(System.identityHashCode(str));
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
    }
    
}
