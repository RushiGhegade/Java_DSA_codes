// NumberFormatException(throws Exception) 

import java.io.*;
public class Program5 {

    void getdata()throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number");
        int data=Integer.parseInt(br.readLine());
        System.out.println(data);
    }
    public static void main(String args[])throws IOException{
        Program5 obj=new Program5();
        obj.getdata();
    }    
}
