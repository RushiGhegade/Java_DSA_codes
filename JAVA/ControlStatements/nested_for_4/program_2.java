//   write a program to print the following pattern
//   1
//   3 4
//   6 7 8
//   10 11 12 13
//   15 16 17 18 19

public class program_2 {
    public static void main(String args[]){
        int k=1;

        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }k++;
            System.out.println();
        }
    }
}
