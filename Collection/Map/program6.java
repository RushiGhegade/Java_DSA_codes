// combarable in TreeMap

import java.util.TreeMap;
class Platform implements Comparable{
    String str=null;
    int foundYear=0;
    Platform(String str,int foundYear){
        this.str=str;
        this.foundYear=foundYear;
    }

    public String toString(){
        return str+":"+foundYear;
    }

    public int compareTo(Object obj){
        // return foundYear - ((Platform)obj).foundYear;
        return str.compareTo(((Platform)obj).str);
    }

}
public class pogram6 {
    public static void main(String args[]){
        TreeMap tm=new TreeMap();
        tm.put(new Platform("YouTube",2005),"Google");
        tm.put(new Platform("Insatgram",2010),"Meta");
        tm.put(new Platform("Facebook",2004),"Meta");
        tm.put(new Platform("Chatgpt",2022),"OpenAl");

        System.out.println(tm);

    }
}
