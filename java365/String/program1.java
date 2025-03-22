// String is valid pelindrome 

import java.util.Scanner;
class program1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        // String str=sc.nextLine();
        String str=" ";

        StringBuffer sb=new StringBuffer(str);

        String str1=sb.reverse().toString();

        if(str.equals(str1)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}