//Program 6 :  Write a program to print the sum of all even numbers and multiplication of odd numbers between 1 to 10.
//Output    :  sum of even numbers between 1 to 10 = 30
//             Multiplication of odd numbers between 1 to 10 = 945

public class Assignment_6 {
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
        System.out.println("sum of even number between 1 to 10 ="+sum);
        System.out.println("multiplication of odd number between 1 to 10 ="+mul);
    }
}
