// spiral matrix


public class program3 {
    static void spiralMatrix(int arr[][]){
        int srow=0;
        int erow=arr.length-1;

        int scol=0;
        int ecol=arr[0].length-1;

        while(srow<=erow && scol<=ecol){
            //Top
            for(int i=scol;i<=ecol;i++){
                System.out.print(arr[srow][i]+"  ");
            }
            
            // Right
            for(int i=srow+1;i<=erow;i++){
                System.out.print(arr[i][ecol]+" ");
            }

            // bottem
            for(int i=ecol-1;i>=scol;i--){
                System.out.print(arr[erow][i]+" ");
            }

            // left
            for(int i=erow-1;i>=srow+1;i--){
                System.out.print(arr[i][scol]+" ");
            }
            
            srow++;
            scol++;
            erow--;
            ecol--;
            
        }
    }
    public static void main(String args[]){

        int arr[][]={{1 ,2 ,3, 4},
                     {5 ,6 ,7, 8},
                     {9 ,10,11,12},
                     {11,12,13,14}};

        spiralMatrix(arr);
    }
}
