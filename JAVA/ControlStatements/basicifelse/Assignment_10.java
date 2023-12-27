// write a java unique real-time example of if else if ladder

import java.io.*;
public class Assignment_10 {
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the three subject mark");
        int math=Integer.parseInt(br.readLine());
        int phy=Integer.parseInt(br.readLine());
        int che=Integer.parseInt(br.readLine());

        float total=math+phy+che;

        System.out.println("total="+total);

        float per =(total/300)*100;
        System.out.println("Percentile="+per);

        if(per>60&&per<70){
            System.out.println("Grade D");
        }else if(per>=70&&per<80){
            System.out.println("Grade C");
        }else if(per>=80&&per<90){
            System.out.println("Grade B");
        }else if(per>=90&&per<=100){
            System.out.println("Grade A");
        }else{
            System.out.println("fail");
        }
    }
}
