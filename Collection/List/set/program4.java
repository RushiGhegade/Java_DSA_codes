// HashSet

import java.util.*;
public class program4 {
    public static void main(String args[]){
        HashSet hs=new HashSet();
        hs.add(10);
        hs.add(20);
        hs.add(new Integer(10));       // consider duplicate data
        hs.add(new Integer(20));       // consider duplicate data

        System.out.println(hs);
    }
}
