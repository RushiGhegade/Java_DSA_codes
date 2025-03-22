//   write a program to print the following pattern
//   3C 3C 3C 3C
//   3C 3C 3C
//   3C 3C
//   3C


public class program_4 {
    public static void main(String args[]){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4-i+1;j++){
                System.out.print("3C ");
            }
            System.out.println();
        }
    }

}

