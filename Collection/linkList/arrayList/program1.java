// collection
// List
// ArrayList All Methods

import java.util.*;
class program1 extends ArrayList{
    public static void main(String args[]){

        // List al=new ArrayList();
        program1 al=new program1();         // when we use protected remove range that time create a object your class which is extends ArrayList;

        // 1) add(obj);
        al.add(10);
        al.add("Rushi");
        al.add(20.5f);
        al.add(10);
        al.add(20.5f);

        // 2) int size();
        System.out.println(al.size());        // 5

        // 3)  Boolean contains(obj);
        System.out.println(al.contains(10));   //true
        System.out.println(al.contains(7));    // false

        // 4) int indexOf(obj);
        System.out.println(al.indexOf(10));     // 3
        System.out.println(al.indexOf(8));     // -1

        // 5) lastIndexOf(obj);
        System.out.println(al.lastIndexOf(10));   // 3
        System.out.println(al.lastIndexOf(8));    // -1

        // 6) E get(int);
        System.out.println(al.get(3));       // 10
        // System.out.println(al.get(8));     // exception : indexOutOfBoundException

        // 7) E set(int,E);
        System.out.println(al.set(2,"Ghegade"));
        System.out.println(al);

        // 8) void add(int,E);
        al.add(3,"Information Technology");
        System.out.println(al);

        // 9) E remove(int);
        System.out.println(al.remove(4));           // 10
        System.out.println(al);

        // 10) Boolean addAll(collection);

        ArrayList al2=new ArrayList();
        al2.add("m1");
        al2.add("m2");
        al2.add(100);

        // addAll(collection);
        al.addAll(al2);
        System.out.println(al);

        // 11) addAll(int,collection);
        al.addAll(1,al2);
        System.out.println(al);

        // 12) protected void remove(int ,int );
        al.removeRange(1,4);
        System.out.println(al);       
        
        // 13) object[] toArray();
        Object arr[]=al.toArray();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        // 14) clear();
        al.clear();
        System.out.println(al);          //[ ]

        
    }
}