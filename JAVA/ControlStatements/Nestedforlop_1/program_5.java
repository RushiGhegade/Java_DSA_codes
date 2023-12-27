//   write a program to print the following pattern
//   12 12 12
//   11 11 11
//   10 10 10


public class program_5 {
    public static void main(String args[]){
        int k=12;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(k+" ");
            }
            System.out.println();
            k--;
        }
    }
}
