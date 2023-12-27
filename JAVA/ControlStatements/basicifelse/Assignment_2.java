// write a java program take number and print whether is less than 10 or greter than 10;


import java.io.*;
public class Assignment_2 {
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number ");
        int num=Integer.parseInt(br.readLine());
        if(num>10){
            System.out.println("Number is greter than 10");
        }else if(num<10){
            System.out.println("Number is less than 10");
        }else{
            System.out.println("Number is equal ");
        }
    }
}
