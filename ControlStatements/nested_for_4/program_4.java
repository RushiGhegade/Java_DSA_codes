//   write a program to print the following pattern
//   1 2 3 4
//   2 3 4
//   3 4
//   4

public class program_4 {
    public static void main(String args[]){
        for(int i=1;i<=4;i++){
            int temp=i;
            for(int j=1;j<=4-i+1;j++){
                System.out.print(temp+" ");
                temp++;
            }
            System.out.println();
        }
    }
}
