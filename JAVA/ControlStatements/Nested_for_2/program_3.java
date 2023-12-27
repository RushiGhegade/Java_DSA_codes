//  write a program to print the following pattern
//  14 15 16 17
//  15 16 17 18
//  16 17 18 19
//  17 18 19 20


public class program_3 {
    public static void main(String args[]){
        int k=14;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                System.out.print(k+" ");
                k++;
            }k=k-3;
            System.out.println();
        }
    }
}
