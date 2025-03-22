//    write a program to print the following pattern
//    F
//    E F
//    D E F
//    C D E F
//    B C D E F
//    A B C D E F


public class program_7 {
    public static void main(String args[]){
        int ch=70,j;

        for(int i=1;i<=6;i++){
            for(j=1;j<=i;j++){
                System.out.print((char)ch+" ");
                ch++;
            }ch=ch-j;
            System.out.println();
        }
    }
}
