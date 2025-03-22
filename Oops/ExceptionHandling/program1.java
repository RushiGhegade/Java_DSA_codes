// IOException Exception

import java.io.*;
class program1{
    public static void main(String args[]){ // trows IOException{
        System.out.println("start main");
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        int data=Integer.parseInt(br.readLine());  // error: IOException

        System.out.println("End main");
    }
}