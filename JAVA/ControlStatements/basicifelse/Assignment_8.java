// write a java program to check day number (1-7) and print the corresponding day of week :

import java.io.*;
public class Assignment_8 {
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the day ");
        int day=Integer.parseInt(br.readLine());

        if(day==1){
            System.out.println("Monday");
        }else if(day==2){
            System.out.println("Tuesday");
        }else if(day==3){
            System.out.println("Wednesday");
        }else if(day==4){
            System.out.println("Thursday");
        }else if(day==5){
            System.out.println("Friday");
        }else if(day==6){
            System.out.println("Saturday");
        }else if(day==7){
            System.out.println("Sunday");
        }else {
            System.out.println("Invalid day");
        }
    }
}
