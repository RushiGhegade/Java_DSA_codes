//   write a program to print the following pattern
//   J
//   I H
//   G F E
//   D C B A

public class program_8 {
    public static void main(String args[]){
        char ch='J';

        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch--;
            }
            System.out.println();
        }
    }
}
