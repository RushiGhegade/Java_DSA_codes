//    write a program to print the following pattern
//    1 2 3 4
//    4 5 6
//    6 7
//    7

public class program_10 {
    public static void main(String args[]){
        int k=1;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4-i+1;j++){
                System.out.print(k+" ");
                k++;
            }k=k-1;
            System.out.println();
        }
    }
}
