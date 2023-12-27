// Program 8  : Write a program to print the countdown of days to submit the assignment
// Input      : day = 7
//Output      : 7 days remaining
//              6 days remaining
//              5 days remaining
//              .
//              .
//              1 days remaining
//              0 days Assignment is Overdue

import java.io.*;
public class Assignment_8 {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the day");
        int day=Integer.parseInt(br.readLine());
        int i=day;
        while(i>=0){
            if(i==0){
                System.out.println(i+" days Assignment is overdue");
                break;
            }
            System.out.println(i+" days remaining");
            i--;
        }
    }
}
