//Program 2: Write a program to calculate the factorial of the given  number.
//      Input:     6
//      Output:    factorial 6 is 720

import java.io.*;
public class Assignment_2 {
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number:");
        int num=Integer.parseInt(br.readLine());
        int fact=1;
        int i=1;
        while(i<=num){
            fact=fact*i;
            i++;
        }
        System.out.println("factorial "+num+" is "+fact);
    }
}
