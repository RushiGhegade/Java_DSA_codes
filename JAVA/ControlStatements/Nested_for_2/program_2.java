//   write a program to print the following pattern
//   4 4 4 4
//   5 5 5 5
//   6 6 6 6
//   7 7 7 7


public class program_2 {
    public static void main(String args[]){
        int k=4;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                System.out.print(k+" ");
            }k++;
            System.out.println();
        }
    }
}
