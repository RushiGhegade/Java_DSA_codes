import java.io.*;
public class magic2_6 {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        char ch='$';

        for(int i=1;i<=8;i++){
            for(int j=1;j<=i;j++) {
                if (i ==4){
                    ch='$';
                }
                System.out.print(ch+"   ");


            }ch--;
            System.out.println();
        }
    }
}
