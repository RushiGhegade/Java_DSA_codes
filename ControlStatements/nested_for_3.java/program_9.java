//  write a program to print the following pattern
//   1
//   8 27
//   64 125 216


public class program_9 {
    public static void main(String args[]){
        int k=1;

        for(int i=1;i<=3;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k*k*k+" ");
                k++;
            }
            System.out.println();
        }
    }
}
