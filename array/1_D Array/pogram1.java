// linear search

import java.util.Scanner;
class program20{
    static void linearSearch(int arr[],int search){
        int flag=0;
        int poss=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==search){
                flag++;
                poss=i;
            }
        }
        if(flag!=0){
            System.out.println(search +" element found in possition :"+poss);
        }else{
            System.out.println(search +"element not found");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[8];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("arr[] :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n Enter the Search element");
        int search =sc.nextInt();
        linearSearch(arr, search);
    }
}