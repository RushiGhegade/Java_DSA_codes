public class perfectnumberRange {
    public static void main(String args[]){


        for(int i=1;i<10000;i++){
            int num=i;
            int fact=0;
            for(int j=1;j<num;j++){
                if(i%j==0){
                    fact=fact+j;
                }
            }

            if(fact==i){
                System.out.println(fact);
            }
        }
    }
}
