// HashCode method : cheak contain 

public class program7 {
    public static void main(String args[]){

        String str1="Rushi";
        String str2=new String("Rushi");
        String str3="Rushi";
        String str4=new String("Rushi");

        // when contain is same then hash code is same;
        System.out.println(System.identityHashCode(str1));
        System.out.println(str1.hashCode());   
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());
    }
    
}
