import java.io.*;

class practice10{
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int row,column;
        System.out.println("enter the row and column:");
        row=Integer.parseInt(br.readLine());
        column=Integer.parseInt(br.readLine());
        int num=1;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row-i+1;j++){
                if(j%2==0){
                    System.out.print(num*num+" ");
                }else{
                    System.out.print(num+" ");
                }
                num++;
            }
            System.out.println();
        }
    }
}