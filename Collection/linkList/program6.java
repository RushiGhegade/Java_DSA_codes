//Enumeration

import java.util.*;
public class program6 {
    public static void main(String args[]){

        Vector al=new Vector();
        al.add(10);
        al.add(20);
        al.add(30);

        Enumeration e=al.elements();
        System.out.println(e.getClass().getName());
        
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
