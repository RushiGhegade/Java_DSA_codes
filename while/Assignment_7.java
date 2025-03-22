//   Program 7 :  Write a program which take’s number from user’s if number is even
//                print that number in reverse order or if number is odd print that number in
//                reverse order by difference two?
//  Input      :  6
//  output     :  6 5 4 3 2 1
//  Input      :  7
//  output     :  7 5 3 1.

import java.io.*;
public class Assignment_7 {
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number");
        int num=Integer.parseInt(br.readLine());

        if(num%2==0){
            int i=num;
            while(i>=1){
                System.out.print(i+" ");
                i--;
            }
        }else{
            int i=num;
            while(i>=1){
                System.out.print(i+" ");
                i=i-2;
            }

        }
    }
}
