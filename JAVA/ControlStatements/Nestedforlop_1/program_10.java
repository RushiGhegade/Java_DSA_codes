//   write a program to print the following pattern
//   1 2 3 4
//   2 3 4 5
//   3 4 5 6
//   4 5 6 7


public class program_10 {
    public static void main(String args[]){
        int k=1,j;
        for(int i=1;i<=4;i++){
            for( j=1;j<=4;j++){
                System.out.print(k+" ");
                k++;
            }k=k-3;
            System.out.println();
        }
    }
}
