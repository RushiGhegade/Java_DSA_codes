
import java.io.*;
public class magic2_3 {
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int row =Integer.parseInt(br.readLine());
        int num=8;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=4;j++){
                if(i%2==1) {
                    System.out.print(num + " ");
                    num=num-2;
                }else{
                    System.out.print(num+" ");
                    num=num+2;
                }
            }num=num+3;
            System.out.println();
        }

    }
}
