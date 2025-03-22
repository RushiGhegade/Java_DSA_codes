import java.io.*;
class butterfly{
    public static void main(String args[])throws IOException{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the row and columan:");
        int row=Integer.parseInt(br.readLine());
        int col=Integer.parseInt(br.readLine());


        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }

            for(int j=1;j<=2*(row-i);j++){
                System.out.print("  ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=row;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=2*(row-i);j++){
                System.out.print("  ");
            }


            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
