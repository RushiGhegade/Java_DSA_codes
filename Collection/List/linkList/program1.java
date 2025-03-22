// basic code 

import java.util.*;
class program1{
    public static void main(String args[]){

        LinkedList ll=new LinkedList();
        // 1) add(obj);
        ll.add(20);
        ll.addFirst(10);
        ll.addLast(new Integer(30));
        ll.add(40);

        // 2) add(int ,object)
        ll.add(2,12);  // linkedList is child of List hence Linkedlist have a index in java collection

        System.out.println(ll);
        // 3) get();
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println(ll.get(2));

        // 4) removeLast();
        ll.removeFirst();
        System.out.println(ll);
        ll.removeLast();
        System.out.println(ll);
        ll.remove(2);
        System.out.println(ll);

    }
}