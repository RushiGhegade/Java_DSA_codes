
// write a java program to calculate sum of even number and multiplication of the odd digit between [0--10]....


public class evenSum_oddMul_digit {
    public static void main(String args[]){
        int i=1;
        int sum=0,mul=1;

        while(i<=10){
            if(i%2==0){
                sum=sum+i;
            }else{
                mul=mul*i;
            }
            i++;
        }
        System.out.println("sum of the even digit[0-10]is="+sum);
        System.out.println("mul of the odd digit[0-10]is="+mul);
    }
}
