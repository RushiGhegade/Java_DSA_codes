//  write a program to print the following pattern
//  1C3 4B2 9A1
//  16C3 25B2 36A1
//  49C3 64B2 81A1


public class program_9 {
    public static void main(String args[]){
        int k=1;

        for(int i=1;i<=3;i++){
            int k1=3;
            char ch='C';
            for(int j=1;j<=3;j++){
                System.out.print((k*k)+""+ch+""+k1+" ");
                k++;
                k1--;
                ch--;
            }
            System.out.println();
        }
    }
}
