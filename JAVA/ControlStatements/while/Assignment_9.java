//Program 9 :  Write a program to reverse the given number.
//Input     :  942111423
//Output    :  324111249

import java.io.*;
public class Assignment_9 {
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number");
        int num=Integer.parseInt(br.readLine());

        int rev=0;
        while(num!=0){
            rev=rev*10;
            rev=rev+num%10;
            num=num/10;
        }
        System.out.println(rev);
    }
}
