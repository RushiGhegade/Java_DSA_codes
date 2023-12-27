//  write a program to print the following pattern
//  F
//  E 1
//  D 2 E
//  C 3 D 4
//  B 5 C 6 D
//  A 7 B 8 C 9


public class program_7 {
    public static void main(String args[]){
        char ch='F';
        int k=1;
        for(int i=1;i<=6;i++){
            char temp=ch;
            for(int j=1;j<=i;j++){
                if(j%2==1){
                    System.out.print(temp+" ");
                    temp++;
                }else{
                    System.out.print(k+" ");
                    k++;
                }
            }ch--;
            System.out.println();
        }
    }
}
