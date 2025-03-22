//   write a program to print the following pattern
//   1
//   8 9
//   27 16 125
//   64 25 216 49

public class program_9 {
    public static void main(String args[]){
        int k=1;
        int j;
        for(int i=1;i<=4;i++){
            int temp=i;
            for( j=1;j<=i;j++){
                if(j%2==1){
                    System.out.print(temp*temp*temp+" ");
                }else{
                    System.out.print(temp*temp+" ");
                }temp++;
            }
            System.out.println();
        }
    }
}
