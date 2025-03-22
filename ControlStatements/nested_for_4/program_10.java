//   write a program to print the following pattern
//   1
//   8  9
//   9  64 25
//   64 25 216 49

public class program_10 {
    public static void main(String args[]){
           for(int i=1;i<=4;i++){
               int temp=i;
               for(int j=1;j<=i;j++){
                   if(temp%2==0){
                       System.out.print(temp*temp*temp+" ");
                       temp++;
                   }else{
                       System.out.print(temp*temp+" ");
                       temp++;
                   }
               }
               System.out.println();
           }
    }
}
