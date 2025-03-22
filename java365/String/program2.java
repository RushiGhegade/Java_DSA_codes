// string valid anagram
import java.util.*;
public class program2 {
    static Boolean anagram(String str,String str1){
        char ch[]=str.toCharArray();
        char ch1[]=str1.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        int count=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]==ch1[i]){
                count++;
            }
        }
        if(count==ch.length){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]){

        String str="anagram";
        String str1="nagaram";

        // int compareto=str.compareTo(str1);

        System.out.println(anagram(str,str1));
    }
}
