// write a java program that checks a number from 0-5 and print its spelling if the number is greater than 5 print number is greater than 5:

import java.io.*;
public class Assignment_4 {
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number:");
        int num=Integer.parseInt(br.readLine());

        if(num==0){
            System.out.println("Zero");
        }else if(num==1){
            System.out.println("One");
        }else if(num==2){
            System.out.println("Two");
        }else if(num==3){
            System.out.println("Three");
        }else if(num==4){
            System.out.println("Four");
        }else if(num==5){
            System.out.println("Five");
        }else if(num>5){
            System.out.println("Number is grater than 5");
        }else{
            System.out.println("Number is less then 0");
        }
    }
}
