//   write a program to print the following pattern
//   10
//   10 9
//   9  8 7
//   7  6 5 4


public class program_3 {
    public static void main(String args[]){
        int k=10;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k+" ");
                k--;
            }k++;
            System.out.println();
        }
    }
}
