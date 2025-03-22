// range of the pelindreom number;

public class pelindreoRange {
    public static void main(String[] args) {


        for(int i=1;i<=200;i++){

            int num=i;
            int temp=i;
            int rem=0;

            while(num!=0){
                rem=rem*10;
                rem=rem+num%10;
                num=num/10;
            }
            if(rem==temp){
                System.out.println(rem);
            }
        }
    }
}
