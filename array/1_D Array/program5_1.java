// print subarray sum & maxsum 

public class program5_1 {
    public static void main(String args[]){
        // int arr[]={2,4,6,8,10};
        int arr[]={1,-2,6,-1,3};
        int n=arr.length;
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                int sum=0 ;                // initialize sum variable
                for(int k=i;k<j;k++){
                    sum=sum+arr[k];        // sum of the subarray
                    if(sum>max){
                            max=sum;
                    }
                    if(sum<min){
                        min=sum;
                    }
                }System.out.print(sum+"\t"); // print sum of the subarray
            }System.out.println();
        }
        System.out.println("max sum :"+max);
        System.out.println("min sum :"+min);
    }
}
