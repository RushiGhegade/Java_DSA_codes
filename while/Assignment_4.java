//   Program 4:   Write a program to count the Odd digits of the given number.
//   Input:       942111423
//   Output:      count of odd digits = 5

import java.io.*;
public class Assignment_4 {
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number");
        int num=Integer.parseInt(br.readLine());
        int count=0;

        while(num!=0){
            int rev=num%10;
            if(rev%2==1){
                count++;
            }
            num=num/10;
        }
        System.out.println("count of the odd digit="+count);

    }
}
