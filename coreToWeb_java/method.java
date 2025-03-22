import java.io.*;
public class method {
    static void pelindrome(int num){
        int temp=num;
        int rem=0,rev=0;
        while(num!=0){
            rem=rem*10;
            rem=rem+num%10;
            num=num/10;

        }
        if(rem==temp){
            System.out.println("number is pelindrome number:");
        }else{
            System.out.println("number is not pelindrome number:");
        }
    }

    static void prime(int num){
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("number is prime number :");
        }else{
            System.out.println("number is not prime number :");
        }
    }

    static void perfectNum(int num){
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }

        if(sum==num){
            System.out.println("number is perfect number :");
        }else{
            System.out.println("number is not perfect number :");
        }
    }

    static void armstrong(int num){
        int sum=0,sum1=0;
        int temp=num;
        int temp1=num;

        while(num!=0){
            sum++;
            num=num/10;
        }
        int rem=0;
        while(temp!=0){
            int sum2=1;
            rem=temp%10;
            for(int i=1;i<=sum;i++){
                sum2=sum2*rem;
            }
            sum1=sum1+sum2;
            temp=temp/10;
        }

        if(temp1==sum1){
            System.out.println("armstrong number:");
        }else{
            System.out.println("not armstrong number");
        }


    }

    static void compositeNum(int num){
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%1==0){
                count++;
            }

        }
        if(count >2){
            System.out.println("composite number :");
        }else{
            System.out.println("not composite number :");
        }
    }

    void strongNum(int num){
        int sum=0;
        int temp=num;
        while(num!=0){
            int rem;
            int mul=1;
            rem=num%10;
            for(int i=1;i<=rem;i++){
                mul=mul*i;
            }
            sum=sum+mul;
            num=num/10;

        }

        if(sum==temp){
            System.out.println("strong number:");
        }else{
            System.out.println("not Strong number:");
        }
    }

    static void automorphic(int num){
        int count =0;
        int temp=num,temp2=num;
        while(num!=0){
            count++;
            num=num/10;
        }

        int squar=temp*temp;
        int rev=0;

            for(int i=1;i<=count;i++){
                rev=rev*10;
                rev=rev+squar%10;
                squar=squar/10;

            }

        int rem=0;
        while(rev!=0){
            rem=rem*10;
            rem=rem+rev%10;
            rev=rev/10;
        }

        if(rem==temp2){
            System.out.println("automorphic number :");
        }else{
            System.out.println("not automorphic number:");
        }

    }

    static void fib(int num){
        int a=0;
        int b=1;

        int c=0;
        System.out.println("fibonachi series =");
        for(int i=1;i<=num;i++){
            System.out.print(c+" ");
            a=b;
            b=c;
            c=a+b;

        }
        System.out.println();
    }
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        method obj=new method();
        while(true) {
            System.out.println("\nselect the which opration you want to perform:\n");
            System.out.println("pelindrome          --> 1");
            System.out.println("prime               --> 2");
            System.out.println("perfect Number      --> 3");
            System.out.println("armstrong Number    --> 4");
            System.out.println("composite Number    --> 5");
            System.out.println("strong number       --> 6");
            System.out.println("Automorphic Number  --> 7");
            System.out.println("fibonachi series    --> 8");

            System.out.println("\n enter the opration:");
            int opr = Integer.parseInt(br.readLine());

            System.out.println("enter the number :");
            int num = Integer.parseInt(br.readLine());

            switch (opr) {
                case 1:
                    pelindrome(num);
                    System.out.println("------*--------*--------*---------*---------*-----------*------------*\n" );
                    break;

                case 2:
                    prime(num);
                    System.out.println("------*--------*--------*---------*---------*-----------*------------*\n" );
                    break;

                case 3:
                    perfectNum(num);
                    System.out.println("------*--------*--------*---------*---------*-----------*------------*\n" );
                    break;

                case 4:
                    armstrong(num);
                    System.out.println("------*--------*--------*---------*---------*-----------*------------*\n" );
                    break;

                case 5:
                    compositeNum(num);
                    System.out.println("------*--------*--------*---------*---------*-----------*------------*\n" );
                    break;

                case 6:
                    obj.strongNum(num);
                    System.out.println("------*--------*--------*---------*---------*-----------*------------*\n" );
                    break;

                case 7:
                    automorphic(num);
                    System.out.println("------*--------*--------*---------*---------*-----------*------------*\n" );
                    break;
                case 8:
                    fib(num);
                    System.out.println("------*--------*--------*---------*---------*-----------*------------*\n" );
                    break;

                default:
                    System.out.println("enter the coorect opration:");
                    System.out.println("------*--------*--------*---------*---------*-----------*------------*\n" );

            }
        }

    }
}