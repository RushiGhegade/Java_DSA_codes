// product of the evendigit in array:

import java.util.Scanner;
public class Array4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("Enter the size :");
        size=sc.nextInt();

        int arr[]=new int[size];
        int mul=1;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            if(i%2==1){
                mul=mul*arr[i];
            }
        }
        System.out.println("product of the odd index only ="+mul);
    }
}
