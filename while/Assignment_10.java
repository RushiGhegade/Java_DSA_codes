//Program 10  :  Write a program to check whether the number is a Palindrome number or not.
//    Input   : 2332
//    Output  : 2332 is a palindrome number

import java.io.*;
public class Assignment_10 {
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number");
        int num=Integer.parseInt(br.readLine());
        int temp=num;
        int rem=0;
        while(num!=0){
            rem=rem*10;
            rem=rem+num%10;
            num=num/10;
        }
        if(temp==rem){
            System.out.println(temp+" is palindrome number:");
        }else{
            System.out.println(temp+" is not palindrome number:");
        }
    }
}
