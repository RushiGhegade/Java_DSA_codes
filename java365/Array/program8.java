public class program8 {
    public static void main(String args[]){
        int arr[][]=new int[][]{{ 1, 2, 3, 4 },     { 5, 6, 7, 8 }, 
        { 9, 10, 11, 12 },  { 13, 14, 15, 16 }, 
        { 17, 18, 19, 20 }};
        
        
        for(int x=0;x<arr[0].length;x++){
            
            
                 int i=x;
                 int j=0;
            while(i>=0 && j<=arr.length){
                System.out.print(arr[i][j]+ " ");
                i--;
                j++;
            }System.out.println();
           

        }
        for(int x=0;x<arr[0].length;x++){
            int i=arr.length-1;
            int j=x;

            while(j<arr[0].length){
                System.out.print(arr[i][j]+" ");
                i--;
                j++;
                
            }System.out.println();
            
        }
    }
}
