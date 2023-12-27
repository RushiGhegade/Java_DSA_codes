//   write a program to print the following pattern
//   10
//   I H
//   7 6 5
//   D C B A

public class program_8 {
    public static void main(String args[]){
        int k=10;
        char ch='J';
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                if(i%2==1){
                    System.out.print(k+" ");
                    k--;
                    ch--;
                }else{
                    System.out.print(ch+" ");
                    ch--;
                    k--;
                }
            }
            System.out.println();
        }
    }
}
