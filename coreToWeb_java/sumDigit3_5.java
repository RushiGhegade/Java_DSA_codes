public class sumDigit3_5 {
    public static void main(String args[]){
        int x=1234;

        int sum=0;

        while(x!=0){
            int rev=x%10;
            sum=sum+rev;
            x=x/10;
        }
        System.out.println("sum of digit is="+sum);
    }
}
