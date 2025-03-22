import java.util.Scanner;

public class strongnumRange {
    public static void main(String args[]) {
        Scanner sc = new Scanner((System.in));
//        int num=sc.nextInt();
        for (int j = 1; j <= 1000000; j++) {
            int num = j;

            int rem, sum = 0, temp = num;
            while (num != 0) {
                rem = num % 10;
                int fact = 1;
                for (int i = 1; i <= rem; i++) {
                    fact = fact * i;
                }
                sum = sum + fact;
                num = num / 10;
            }

            if(sum==temp){
                System.out.println(sum);
            }
        }
    }
}
