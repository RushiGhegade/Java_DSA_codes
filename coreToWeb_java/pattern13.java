class pattern13{
    public static void main(String args[]){

        int ch=70;
        for(int i=1;i<=6;i++){

            for(int j=1;j<=i;j++){
                System.out.print((char)ch++ +" ");
            }System.out.println();
            ch=ch-i-1;
        }
    }
}