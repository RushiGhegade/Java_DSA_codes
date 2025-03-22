public class pattern9 {
    public static void main(String args[]){
        char a='A';
        int b=1,n=4;

        for(int i=1;i<=4;i++){
            for(int j=1;j<=n-i+1;j++){
                if(j%2==0){
                    System.out.print(b+" ");
                    b++;
//                    a++;
                }else{
                    System.out.print(a+" ");
                    a++;
//                    b++;
                }
            }
            System.out.println();
        }
    }
}
