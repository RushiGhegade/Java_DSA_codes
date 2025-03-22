
import java.io.*;
public class magic2 {
    public static void main(String args[])throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the row:");
        int row=Integer.parseInt(br.readLine());

        char ch='D';
        int num=4;

        for(int i=1;i<=row;i++){
            for(int j=1;j<=row;j++){
                if(i%2==1){
                    System.out.print((char)ch+""+num+" ");
                    num--;
                    ch--;
                }else{
                    ch++;
                    num++;
                    System.out.print((char)ch+""+num+" ");

                }
            }
            System.out.println();
        }
    }

}
