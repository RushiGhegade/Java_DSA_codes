// close stram Exception
import java.io.*;
public class Program6 {
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=null;
    
         str=br.readLine();
        
        br.close();
        System.out.println(str);
        String str2=br.readLine();
        System.out.println(str2);
    }    
}
