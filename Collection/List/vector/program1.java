// vector 

import java.util.*;
class program1{
    public static void main(String args[]){
        LinkedList ll=new LinkedList();
        ll.addFirst(10);
        ll.addLast(20);

        ArrayList al=new ArrayList(ll);
        al.add(90);
        al.add(100);
        al.add(120);

        Vector v=new Vector(al);

        v.addElement(10);
        v.addElement(20);
        v.addElement(30);
        v.addElement(40);
        
        System.out.println(v);

        System.out.println(v.capacity());     // default capacity 10 (10*2)

        System.out.println(v.removeElement(10));
        
        
    }
}