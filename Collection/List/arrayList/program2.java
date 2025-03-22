// for loop in ArrayList (mostly for loop is use in collection)

import java.util.*;
public class program2 {
    public static void main(String args[]){
        ArrayList al=new ArrayList();
        al.add(10);
        al.add(20);
        al.add(new Integer(30));
        al.add(40);

        /*for(Integer obj:al){       // error :incompatiable type object canot be converted int
            System.out.println(obj);
        }*/

        for(Object obj:al){
            System.out.print(obj+" ");
        }

        System.out.println();

        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i)+" ");
        }

        System.out.println();

        for(var obj:al){
            System.out.print(obj+" ");
        }
    }
}
