import java.io.*;
public class magic2_5 {
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the chr:");
        char a=(char)br.read();
        br.skip(1);
        char b=(char)br.read();

        if(a==b){
            System.out.println("charactor are equal:");
        }else{
            if(a>b){
                System.out.println((char)a-b);
            }else{
                System.out.println(((char)b-a));
            }
        }
    }
}
