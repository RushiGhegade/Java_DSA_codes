//   Program 5 :   Write a program to print the square of even digits of the given number.
//   Input     :   942111423
//   Output    :   4 16 4 16


import java.io.*;
public class Assignment_5 {
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number ");
        int num=Integer.parseInt(br.readLine());

        while(num!=0){
            int rev=num%10;
            if(rev%2==0){
                System.out.print(rev*rev+" ");
            }
            num=num/10;
        }
    }
}
