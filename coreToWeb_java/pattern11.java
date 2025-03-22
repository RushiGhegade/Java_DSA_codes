public class pattern11 {
    public static void main(String args[]){
        int n=1;
        char b='a';
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                if(j%2==0){
                    System.out.print(b+" ");
                    n++;
                    b++;
                }else{
                    System.out.print(n+" ");
                    n++;
                    b++;
                }
            }
            System.out.println();
        }
    }
}
