// write a java program to cheak if number is even or odd ;



import java.io.*;

public class Assignment_1 {
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number ");
        int num=Integer.parseInt(br.readLine());

        if(num%2==0){
            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd");
        }
    }
}
