// transpose matrix

class program5{
    public static void main(String args[]){
        
        int arr[][]={{1,2,3},
                     {5,6,7}
                    ,{8,9,7}};
        int row=arr.length;
        int col=arr[0].length;

        int transpose[][]=new int[col][row];
         // transpose matrix
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                transpose[j][i]=arr[i][j];
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }System.out.println();
        }System.out.println();

        for(int i=0;i<transpose.length;i++){
            for(int j=0;j<transpose[i].length;j++){
                System.out.print(transpose[i][j]+" ");
            }System.out.println();
        }
        
    }
}



