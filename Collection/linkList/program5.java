//  corsor
//  ListIterator

import java.util.*;
public class program5 {
   public static void main(String args[]){

        ArrayList al=new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        ListIterator ll=al.listIterator();

        while(ll.hasNext()){
            System.out.print(ll.next()+" ");
            System.out.println(ll.nextIndex());
        }
        System.out.println();

        while(ll.hasPrevious()){
            System.out.print(ll.previous()+" ");
            System.out.println(ll.nextIndex());
            ll.remove();
        }
        System.out.println(al);
   } 
}
