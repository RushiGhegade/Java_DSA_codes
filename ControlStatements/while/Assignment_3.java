// Program 3:      Write a program to count the digits of the given number.
//     Input:      942111423
//     Output:     count of digits = 9


import java.io.*;
public class Assignment_3 {
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number");
        int num=Integer.parseInt(br.readLine());

        int count=0;

        while(num!=0){
            count++;
            num=num/10;
        }
        System.out.println("count of digit ="+count);
    }
}
