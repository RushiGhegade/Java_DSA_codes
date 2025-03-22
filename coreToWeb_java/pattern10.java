public class pattern10 {
    public static void main(String args[]){
        int num=1;
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                if(j%2==0){
                    System.out.print(num*num+" ");
                    num++;
                }else{
                    System.out.print(num+ " ");
                    num++;
                }
            }
            System.out.println();
        }
    }
}
