//comparator

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Movie{
    String name=null;
    double coll=0.0;
    float rating=0.0f;
    Movie(String name,double coll,float rating){
        this.name=name;
        this.coll=coll;
        this.rating=rating;
    }
    public String toString(){
        return name+":"+coll+":"+rating;
    }
}
class sortByName implements Comparator{
    public int compare(Object obj1,Object obj2){
        return ((Movie)obj1).name.compareTo(((Movie)obj2).name);
    }
}

class sortByColl implements Comparator{
    public int compare(Object obj1,Object obj2){
        return (int)(((Movie)obj1).coll-((Movie)obj2).coll);
    }
}

class sortByRating implements Comparator{
    public int compare(Object obj1,Object obj2){
        return (int)(((Movie)obj1).rating-((Movie)obj2).rating); // for desending     => -();
    }
}
public class program4 {
    public static void main(String args[]){
        ArrayList al=new ArrayList();
        al.add(new Movie("gadar",100,5.2f));
        al.add(new Movie("ved",400,9.2f));
        al.add(new Movie("sairat",800,7.2f));
        al.add(new Movie("bbj",50,9.2f));

        System.out.println(al);

        Collections.sort(al,new sortByName());
        System.out.println(al);

        Collections.sort(al,new sortByColl());
        System.out.println(al);

        Collections.sort(al,new sortByRating());
        System.out.println(al);
    }
}
