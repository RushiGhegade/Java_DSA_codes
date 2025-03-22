//  write a program to print the following pattern
//  C2W
//  C2W C2W
//  C2W C2W C2W
//  C2W C2W C2W C2W


public class program_1 {
    public static void main(String args[]){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("C2W ");
            }
            System.out.println();
        }
    }
}
