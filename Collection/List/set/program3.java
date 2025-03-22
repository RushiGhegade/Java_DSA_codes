// LinkedHashSet  (1.4)
// insertion order preserve 
// duplicate data not allowed
import java.util.*;
public class program3 {
    public static void main(String args[]){
        
        LinkedHashSet hs=new LinkedHashSet();
        hs.add("Kanha");
        hs.add("Rahul");
        hs.add("Ashish");
        hs.add("Badhe");
        hs.add("Rahul");
        hs.add("Ashish");

        System.out.println(hs);
    }
}
