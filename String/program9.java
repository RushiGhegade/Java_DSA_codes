// My String Function

import java.util.Scanner;
class Myfun{
    // conactination fun
    String concat(String str1,String str2){          
        return str1+str2;
    }
    // length fun
    int length(String str){ 
        char ch[]=str.toCharArray();
        int count=0;
        for(int i=0;i<ch.length;i++){
            count++;
        }
        return count;
    }
    // charAt
    char charat(String str,int index){
        char ch[]=str.toCharArray();
        return ch[index];
    }

    // compare to
    int compareto(String str1,String str2){
        char ch1[]=str1.toCharArray();
        char ch2[]=str2.toCharArray();
        
        
        if(ch1.length==ch2.length){
            int count=0;
            int re=0;
            for(int i=0;i<ch1.length;i++){
                if(ch1[i]==ch2[i]){
                    count++;
                }else{
                     if(ch1[i]>ch2[i]){
                        re=ch1[i]-ch2[i];
                     }else{
                        re=ch2[i]-ch1[i];
                     }                     
                     break;                       
                }
            }
            if(count==ch1.length){
                return 0;
            }else{
                return re;
            }
        }else{
            int len1=ch1.length;
            int len2=ch2.length;
            int len=0,Hlen=0;
            if(len1<len2){
                len=len1;
                Hlen=len2;
            }else{
                len=len2;
                Hlen=len1;
            }
            int count=0,re=0;
            for(int i=0;i<len;i++){
                if(ch1[i]==ch2[i]){
                    count++;
                }else{
                    re=ch1[i]-ch2[i];
                    break;
                }
            }
            if(count==len){
                return len-Hlen;
            }else{
                return re;
            }                    
        }  

    }

    // equal to 
    Boolean equalto(String str1,String str2){
        char ch1[]=str1.toCharArray();
        char ch2[]=str2.toCharArray();

        if(ch1.length==ch2.length){
            int count=0;
            for(int i=0;i<ch1.length;i++){
                if(ch1[i]==ch2[i]){
                    count++;
                }
            }
            if(count==ch1.length){
                return true;
            }else{
                return  false;
            }
        }else{
            return false;
        }
    }
    // index of 
    int indexof(String str,char c,int index){
        char ch[]=str.toCharArray();
        int found=0;
        for(int i=index;i<ch.length;i++){
            if(c==ch[i]){
                found=i;
                break;
            }
        }
        return found;
    }
    // replace 
      char[] replace(String str,char oldc,char newc){
            char ch[]=str.toCharArray();

            for(int i=0;i<ch.length;i++){
                if(ch[i]==oldc){
                    ch[i]=newc;
                }
            }
            return ch;
      }

}

class program9{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Myfun obj=new Myfun();
        System.out.println("Enter the 2 String");
        String str=sc.nextLine();
        String str1=sc.nextLine();

        System.out.println(obj.concat(str,str1));          // concatination of the string
        
        System.out.println(obj.length(str));

        System.out.println(obj.charat(str,1));

        System.out.println(obj.compareto(str ,str1));

        System.out.println(obj.equalto(str,str1));

        System.out.println(obj.indexof(str,'h',2));
        
        System.out.println(obj.replace(str, 's', 'H'));
    }
}