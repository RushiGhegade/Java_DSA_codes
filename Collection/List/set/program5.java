// HashSet
// userdefine

import java.util.*;
class Myclass{
    int jrNo=0;
    String name=null;
    Myclass(int jrNo,String str){
        this.jrNo=jrNo;
        this.name=name;
    }
    public String toString(){
        return jrNo+":"+name;
    }

}
class program5{
    public static void main(String args[]){
        HashSet hs=new HashSet();
        hs.add(new Myclass(7,"MSD"));
        hs.add(new Myclass(18,"VIRAT"));
        hs.add(new Myclass(45,"ROHIT"));
        hs.add(new Myclass(7,"MSD"));          // Duplicate data consider 

        System.out.println(hs);
    }
}