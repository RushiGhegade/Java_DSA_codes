//HashMap over garbege Collector
// it take part  on Garbege collector

import java.util.HashMap;
class info{
    String name=null;
    info(String name){
        this.name=name;
    }
    public String toString(){
        return name;
    }
    public void finalize(){
        System.out.println("Notify");
    }
    
}
public class program11 {
    public static void main(String args[]){
        
        info obj1=new info("Rushi");
        info obj2=new info("Abhii");
        info obj3=new info("shrii");
        info obj4=new info("kiran");

        HashMap hs=new HashMap();
        hs.put(obj1,"Ghegade");
        hs.put(obj2,"Gaikwad");
        hs.put(obj3,"khade");
        hs.put(obj4,"shelke");

        System.out.println(hs);

        obj1=null;
        System.gc();
        
        System.out.println(hs);
    }
    
}
