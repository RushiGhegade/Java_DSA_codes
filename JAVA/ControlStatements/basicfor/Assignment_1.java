// Write a program to print the first 10 numbers

import java.io.*;
public class Assignment_1 {
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        for(int i=1;i<=10;i++){
            System.out.print(i+" ");
        }
    }
}
