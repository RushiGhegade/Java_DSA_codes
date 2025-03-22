// even odd count in arry:

import java.util.*;
public class Array2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();


        int arr[]=new int[size];
        System.out.println("Enter the element in the arry:");

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int evenCount=0 , oddCount=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        System.out.println("even count is = "+evenCount);
        System.out.println("odd count is = "+oddCount);

    }
}
