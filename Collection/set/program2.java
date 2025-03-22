// list sort 
// collections
import java.util.ArrayList;
import java.util.Collections;
public class program2 {
    public static void main(String args[]){
        ArrayList al=new ArrayList();
        al.add("rushi");
        al.add("ashish");
        al.add("harshal");
        al.add("sam");
        al.add("rushi");

        System.out.println(al);

        // TreeSet ts=new TreeSet(al);
        Collections.sort(al);

        System.out.println(al);
    }
}
