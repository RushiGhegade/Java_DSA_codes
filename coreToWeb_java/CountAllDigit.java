public class CountAllDigit {
    public static void main(String args[]){
        int num=942111423;
        int count=0;

        while(num!=0){
            count++;

            num=num/10;
        }
        System.out.println("totale digit="+count);
    }
}
