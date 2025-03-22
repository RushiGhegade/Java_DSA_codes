
// write a program to print the squar of the even digit of the given number
//input=942111423;
//output=4 16 4 16;

public class squar_Even_digit {
    public static void main(String args[]){
        int num=942111423;
        int rev;
        System.out.println("squar of the even digit=");
        while(num!=0){
            rev=num%10;
            if(rev%2==0){
                System.out.print(rev*rev+" ");
            }
            num=num/10;
        }
    }
}
