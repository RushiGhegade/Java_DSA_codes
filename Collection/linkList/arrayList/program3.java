// Add userdefine class in ArrayList

import java.util.*;
class cricinfo{
    int jrno=0;
    String name=null;
    cricinfo(int jrno,String name){
        this.jrno=jrno;
        this.name=name;
    }
    public String toString(){
        // fun();    
        return jrno+":"+name;        
    }
    static void fun(){
        System.out.println("in fun method");
    }
}
public class program3 {
    public static void main(String args[]){

        ArrayList al=new ArrayList();

        al.add(new cricinfo(7,"MAHI"));
        al.add(new cricinfo(18,"VIRAT"));
        al.add(new cricinfo(45,"ROHIT"));
        al.add(new Integer(20));
        al.add(new cricinfo(8,"rushi").name);

        System.out.print(al);

        al.add(new cricinfo(1,"hardik"));
        al.add(0,new cricinfo(90,"shir"));
        System.out.println(al);
    }
}
