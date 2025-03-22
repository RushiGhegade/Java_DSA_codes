// iterator over map
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
class program8{
        public static void main(String args[]){
                HashMap hm=new HashMap();
                hm.put("Rushi","Ghegade");
                hm.put("Abhi","Gaikwad");
                hm.put("Shri","Khade");
                hm.put("kiran","Shelke");
                System.out.println(hm);

                Set<Map.Entry> data     = hm.entrySet();
                Iterator<Map.Entry> itr = data.iterator();

                while(itr.hasNext()){
                        // System.out.println(itr.next());
                         Map.Entry abc=itr.next();
                         System.out.println(abc);
                }

        }
}