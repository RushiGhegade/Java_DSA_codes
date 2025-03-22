//  write a program to print the following pattern
//  A B C D
//  B C D
//  C D
//  D

public class program_5 {
    public static void main(String[] args) {
        char ch='A';
        for(int i=1;i<=4;i++){
            char temp=ch;
            for(int j=1;j<=4-i+1;j++){
                System.out.print(temp+" ");
                temp++;
            }ch++;
            System.out.println();
        }
    }
}
