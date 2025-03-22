// Write a program in java to accept three numbers and check whether they
//  are Pythagorean triplets or not


import java.io.*;
public class Assignment_9 {
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the tree number");
        int a=Integer.parseInt(br.readLine());
        int b=Integer.parseInt(br.readLine());
        int c=Integer.parseInt(br.readLine());

        if(a*a+b*b==c*c){
            System.out.println("it is pythagorean triplet");
        }else{
            System.out.println("not pythagorean triplet");
        }

    }
}
