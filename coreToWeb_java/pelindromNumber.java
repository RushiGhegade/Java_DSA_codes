//pelindrom number

public class pelindromNumber {
    public static void main(String args[]){
        int num=323;
        int rNum=num;
        int rev=0;
        while(num!=0){
            rev=rev*10;
              rev=rev+num%10;
              num=num/10;
        }

        if(rNum==rev){
            System.out.println("the number is pelindrom number");
        }else{
            System.out.println("the number is not pelindrom number");
        }
    }
}
