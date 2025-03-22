// Handel NumberFormatException using try catch block ;


import java.io.*;
public class program8 {
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String str=br.readLine();
        System.out.println(str);
        int data=0;
        try{
             data=Integer.parseInt(br.readLine());    // Risky code
             System.out.println(data);
        }catch(NumberFormatException e){
            System.out.println("Enter the correct Integer Number");
            data=Integer.parseInt(br.readLine());                      // hander code
            System.out.println(data);

        }

    }
}
