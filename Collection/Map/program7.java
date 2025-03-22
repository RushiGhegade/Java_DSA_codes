// Comparator in TreeMap

import java.util.Comparator;
import java.util.TreeMap;
class platform{
    String name=null;
    int platYear=0;
    platform(String name,int platYear){
        this.name=name;
        this.platYear=platYear;
    }    
    public String toString(){
        return  name+":"+platYear;
    }
}
class SortByName implements Comparator{
        public int compare(Object obj1,Object obj2){
            return ((platform)obj1).name.compareTo(((platform)obj2).name);
        }
}

class sortByYear implements Comparator{
        public int compare(Object obj1,Object obj2){
            return ((platform)obj1).platYear - ((platform)obj2).platYear;
        }
}
public class program7 {
    public static void main(String args[]){
        TreeMap tm=new TreeMap(new sortByYear());
        tm.put(new platform("YouTube",2005),"Google");
        tm.put(new platform("Instagram",2010),"Meta");
        tm.put(new platform("FaceBook",2004),"Meta");
        tm.put(new platform("ChatGpt",2022),"OpenAl");

        System.out.println(tm);
        
    }
}
