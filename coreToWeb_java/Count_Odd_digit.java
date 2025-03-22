//write a program to count odd digit of the given number
// input =942111423;
//output=count of odd digit is=5;

public class Count_Odd_digit {
    public static void main(String args[]){
        int num=942111423;
        int rev;
        int count=0;

        while(num!=0){
            rev=num%10;
            if(rev%2==1){    // remender of 2 is alwyes is 1;
                count++;
            }
            num=num/10;
        }

        System.out.println("totale number of odd digit is="+count);
    }

}
