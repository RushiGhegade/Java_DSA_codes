// treeset 
// userdefine

import java.util.*;
class Myclass implements Comparable{
    String str=null;
    Myclass(String str){
        this.str=str;
    }   
    public int compareTo(Myclass obj){
        return 1;
    }
    public String toString(){
        return str;
    }

}
public class program7 {
    public static void main(String[] args) {
        TreeSet t=new TreeSet();
        t.add(new Myclass("Kanha"));
        t.add(new Myclass("Ashish"));
        t.add(new Myclass("Rahul"));
        t.add(new Myclass("Bhade"));

        System.out.println(t);

    }
}
