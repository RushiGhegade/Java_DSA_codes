public class pattern19 {
    public static void main(String args[]){

        int a=1,j;
        int ch=65;
        for(int i=1;i<=6;i++){

            for( j=1;j<=6-i+1;j++){
                if(j%2==0){
                    System.out.print(a++ +" ");
                }else{
                    System.out.print((char)ch++ +" ");
                }
            } System.out.println();
            ch=ch-2;

        }
    }
}
