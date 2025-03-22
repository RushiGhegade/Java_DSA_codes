// write a java program to find a maximum between three numbers

import java.io.*;
public class Assignment_6 {
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the tree number");
        int num1=Integer.parseInt(br.readLine());
        int num2=Integer.parseInt(br.readLine());
        int num3=Integer.parseInt(br.readLine());

        if(num1>num2&num1>num3){
            System.out.println(num1+" is maximum between "+num1+","+num2+" and "+num3);
        }else if(num2>num1&num2>num3){
            System.out.println(num2+" is maximum between "+num1+","+num2+" and "+num3);
        }else if(num3>num1&num3>num2){
            System.out.println(num3+" is maximum between "+num1+","+num2+" and "+num3);
        }else if(num1==num2&num1>num3){
            System.out.println(num1+" & "+num2+" are equal and maximum between "+num1+","+num2+" and "+num3);
        }else if(num1==num3&num1>num2){
            System.out.println(num1+" & "+num3+" are equal and maximum between "+num1+","+num2+" and "+num3);
        }else{
            System.out.println(num2+" & "+num3+" are equal and maximum between "+num1+","+num2+" and "+num3);
        }
    }
}
