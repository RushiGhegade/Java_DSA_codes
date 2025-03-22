// cursor
// 1)iterator  (hasNext,next,remove)

import java.util.*;
public class program3 {
    public static void main(String args[]){
        ArrayList al=new ArrayList();
        al.add("rushi");
        al.add("Ghegade");
        al.add("zeal");

        Iterator alt=al.iterator();
        System.out.println(alt.next());
        // System.out.println(alt.hasNext());
        alt.remove();
        System.out.println(alt.next());
        System.out.println(alt.next());
        /*System.out.println(alt.hasNext());
        System.out.println(alt.next());
        System.out.println(alt.hasNext());*/

        /*
        while(alt.hasNext()){
            System.out.println(alt.next());
        }*/

    }
}
