//    write a program to print the following pattern
//    d d d d
//    c c c c
//    b b b b
//    a a a a


public class program_8 {
    public static void main(String args[]){
        char ch='d';
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(ch+" ");
            }
            System.out.println();
            ch--;
        }
    }
}
