// Capacity of String Buffer 
 
public class program11 {
    public static void main(String[] args) {
        
        StringBuffer str=new StringBuffer();
        System.out.println(str.capacity());         // 16

        str.append("Rushi");
        System.out.println(str.capacity());        // 16
        
        str.append("Ghegade");                 // 16
        System.out.println(str.capacity());

        str.append("core2web");
        System.out.println(str.capacity());        // 16*2+2

        StringBuffer str1=new StringBuffer(100);
        System.out.println(str1.capacity());
        
        str1.append("Rushi");
        System.out.println(str1.capacity());        // 100
        
        str1.append("Ghegade");                 // 100
        System.out.println(str1.capacity());

        str1.append("core2web");
        System.out.println(str1.capacity());        // 100


    }
}
