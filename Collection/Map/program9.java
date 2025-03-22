import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class pogram9 {
    public static void main(String args[]){
        SortedMap sm=new TreeMap(); 
        sm.put("rushi","Ghegade"); 
        sm.put("ashish","ghegade");
        sm.put("kiran","shelke");
        sm.put("abhii","gaikwad"); 
        
        System.out.println(sm);

        Set<Map.Entry> data=sm.entrySet();
        Iterator<Map.Entry> itr=data.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
