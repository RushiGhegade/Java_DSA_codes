//  write a program to print the following pattern
//  1 2 9
//  4 25 6
//  49 8 81

public class program_7 {
    public static void main(String args[]){
        int k=1;
        for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++){
                if(k%2==1){
                    System.out.print(k*k+" ");
                    k++;
                }else{
                    System.out.print(k+" ");
                    k++;
                }
            }
            System.out.println();
        }
    }
}
