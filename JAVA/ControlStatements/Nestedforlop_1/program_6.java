//   write a program to print the following pattern
//   9 8 7
//   9 8 7
//   9 8 7


public class program_6 {
    public static void main(String args[]){
        for(int i=0;i<3;i++){
            int k=9;
            for(int j=0;j<3;j++){
                System.out.print(k+" ");
                k--;
            }
            System.out.println();
        }
    }
}
