/* calculate profit or loss.
    write a program to take cost price and selling price and calculates its profit or loss  */


import java.io.*;
public class Assignment_7 {
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the selling price ");
        int sellingprice=Integer.parseInt(br.readLine());
        System.out.println("Enter the cost price ");
        int costprice=Integer.parseInt(br.readLine());

        if(sellingprice>costprice){
            System.out.println("profit ="+(sellingprice-costprice));
        }else if(sellingprice<costprice){
            System.out.println("loss ="+(costprice-sellingprice));
        }else{
            System.out.println("not profit no loss");
        }
    }
}
