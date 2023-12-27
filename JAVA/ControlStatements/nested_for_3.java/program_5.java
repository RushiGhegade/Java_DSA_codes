//   write a program to print the following pattern
//   10 10 10 10
//   11 11 11
//   12  12
//   13

public class program_5 {
    public static void main(String args[]){
        int k=10;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4-i+1;j++){
                System.out.print(k+" ");
            }k++;
            System.out.println();
        }
    }
}
