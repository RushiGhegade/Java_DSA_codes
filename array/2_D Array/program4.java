// Diagonal sum

public class program4 {

    static int prisum(int arr[][]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(i==j){                        // primary Diagonal Sum
                    sum=sum+arr[i][j];
                }
                if(i+j==arr[0].length-1){                      // secondary diagonal sum
                    if(i!=j){                     // no repeted element take again
                    sum=sum+arr[i][j];
                    }
                }
                
            }
        }
        return sum;
    }
    static int secsum(int arr[][]){
        int sum=0;
        int f=0;
        int l=arr[0].length-1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(f==i&&l==j){                      // or if(i+j==3) 
                    sum=sum+arr[i][j];
                    f++;
                    l--;
                }
            }
        }
        return sum;
    }
    public static void main(String args[]){
        int arr[][]={{1, 2, 3},
                     {5, 6, 7},
                     {9, 10,11}
                    };

        System.out.println("primary + secondary Diagonal Sum :"+prisum(arr));
        System.out.println("secondery Diagonal Sum :"+secsum(arr));
        
    }
}
