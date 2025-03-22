public class program7 {

    public static void  main(String args[]){
        int arr[]=new int[]{3,2,6,5,0,3};

        int max=Integer.MIN_VALUE;
    
        for(int i=0;i<arr.length;i++){
            int buy=arr[i];
            int sell=arr[i];

            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>sell){
                    
                    sell=arr[j];
                }
            }
            int diff=sell-buy;
            if(diff>max){
                max=diff;
            }
        }
        System.out.println(max);
        
    }
    
}
