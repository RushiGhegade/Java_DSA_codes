//  tya number chya square cha last last cha digit cha ha equal asto tya numberla;
// eg.
//    5     |  25        #number
//    2[5]  |  1[25]      #square
//    ||    |  ||
//    5     |  25      1 digit take last 1 digit ||  2 digit take last 2 digit  || etc....

import java.util.Scanner;

public class automorphicNum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0 ,temp=num ,rev=0 ;


        int square = temp*temp;
        System.out.println("square="+square);
        while(num!=0){
            count++;
            num=num/10;
        }
        System.out.println("count="+count);

        for(int i=1;i<=count;i++){
            rev=rev*10 ;
            rev=rev+square%10 ;
            square=square/10  ;
        }
        System.out.println("last digit="+rev);

        int temp2=0;
        while(rev!=0){
            temp2=temp2*10;
            temp2=temp2+rev%10;
            rev=rev/10;
        }
        System.out.println("last digit reverse="+temp2);

        if(temp2==temp){
            System.out.println("automorphic number");
        }else{
            System.out.println("not automorphic number:");
        }

    }
}
