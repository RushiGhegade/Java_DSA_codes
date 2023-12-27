//   write a program to print the following pattern
//   1
//   2 3
//   3 4 5
//   4 5 6 7


public class program_6 {
    public static void main(String args[]){
        for(int i=1;i<=4;i++){
            int temp=i;
            for(int j=1;j<=i;j++){
                System.out.print(temp+" ");
                temp++;
            }
            System.out.println();
        }
    }
}
