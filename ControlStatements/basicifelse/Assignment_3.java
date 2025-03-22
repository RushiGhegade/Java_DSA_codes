// write a java program take number and print number whether it is positive or negative;


import java.io.*;
public class Assignment_3 {
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number:");
        int num=Integer.parseInt(br.readLine());

        if(num>0){
            System.out.println("Number is positive");
        }else if(num<0){
            System.out.println("Number is negative");
        }else{
            System.out.println("Number is equal to zero");
        }
    }
}
