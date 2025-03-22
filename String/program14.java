// cheak String is pelindrome or not
import java.util.Scanner;
public class program14 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        StringBuffer str1=new StringBuffer(str);

        String str2=str1.reverse().toString();
        
        if(str.equals(str2)){
            System.out.println(" String is pelindrome ");
        }else{
            System.out.println("String is not pelindrome");
        }
    }
}
