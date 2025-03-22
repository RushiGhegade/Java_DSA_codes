public class armstrongNumberRange {
    public static void main(String args[]){
        for(int i=1;i<=200;i++){
            int num=i,temp=i,temp2=i;
            int count=0;

            int square=num*num;
            while(num!=0){
                count++;
            }
            int rem=0;
            while(square!=0){

                for(int j=1;j<=count;j++){
                    rem=rem*10;
                    rem=rem+square%10;
                    square=square/10;
                }

            }
            int orem=0;
            while(rem!=0){
                orem=orem*10;
                orem=orem+rem%10;
                rem=rem/10;
            }
            if(orem==temp){
                System.out.println(i);
            }
        }
    }
}
