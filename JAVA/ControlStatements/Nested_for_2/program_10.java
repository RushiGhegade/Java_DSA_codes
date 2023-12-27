//   write a program to print the following pattern

//  F 5 D 3 B 1
//  F 5 D 3 B 1
//  F 5 D 3 B 1
//  F 5 D 3 B 1
//  F 5 D 3 B 1
//  F 5 D 3 B 1

public class program_10 {
    public static void main(String args[]){
        for(int i=1;i<=6;i++){
            char ch='F';
            int k=6;
            for(int j=1;j<=6;j++){
                if(j%2==1){
                    System.out.print(ch+" ");
                    ch--;
                    k--;
                }else{
                    System.out.print(k+" ");
                    k--;
                    ch--;
                }
            }
            System.out.println();
        }
    }
}
