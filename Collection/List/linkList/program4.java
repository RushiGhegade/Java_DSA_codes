// cursor
// iterator
import java.util.*;
public class program4 {
    public static void main(String args[]){
        ArrayList al=new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);

        System.out.println(al);

        Iterator itr=al.iterator();
        System.out.println(itr.getClass().getName());
        
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
            itr.remove();
        }
        itr.remove();
        System.out.println(al);

    }
}
