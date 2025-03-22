

public class program7 {
    public static void main(String args[]){
        int arr[]={4,2,0,6,3,2,5};
        int n=arr.length;
        int leftmax[]=new int[n];
        leftmax[0]=arr[0];
        System.out.println(leftmax[0]);
        for(int i=1;i<n;i++){
            if(leftmax[i]>arr[i]){
                leftmax[i]=arr[i];
                System.out.println("i"+leftmax[i]);
            }else{
                leftmax[i]=leftmax[i-1];
                System.out.println("e"+leftmax[i]);
            }
        }

        for(int i=0;i<n;i++){
            System.out.print(leftmax[i]+" ");
        }
    }    
}
