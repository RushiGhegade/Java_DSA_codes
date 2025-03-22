// LinkedList userdefine class

import java.util.*;
class moinfo{
    String mo=null;
    String os=null;

    moinfo(String mo,String os){
        this.mo=mo;
        this.os=os;
    }

    public String toString(){
        return mo+":"+os;
    }
}
public class program2 {
 
    public static void main(String args[]){
        
        LinkedList ll=new LinkedList();
        ll.add(new moinfo("oppo","color os"));
        ll.add(new moinfo("iphone","ios"));
        ll.add(new moinfo("google pixel","android os"));

        System.out.println(ll);

        ll.addFirst(new moinfo("one pluse","android os"));
       
        System.out.println(ll);

        ll.remove();
        System.out.println(ll);
    }
}
