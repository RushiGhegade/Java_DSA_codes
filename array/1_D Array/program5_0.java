//  print subarry 

public class program5_0 {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                
                for(int k=i;k<j;k++){
                  System.out.print(arr[k]+" ");
                }
                count++;
                System.out.print("\t");
            }
            System.out.println();
        }
        System.out.println("tota sub array count ="+count);
    }
    
}
