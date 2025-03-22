public class practice4 {
    public static void main(String args[]){

        int num=25;
        int count=0,temp=num   ,temp3=num     ;
        while(num!=0){
            count++;
            num=num/10;
        }
        int square=temp*temp;
        int rem=0;
        for(int i=1;i<=count;i++){
            rem=rem*10;
            rem=rem+square%10;
            square=square/10;
        }

        int temp2=0;
        while(rem!=0){
            temp2=temp2*10;
            temp2=temp+rem%10;
            rem=rem/10;
        }

        if(temp2==temp3){
            System.out.println("automorphic number");
        }else{
            System.out.println("not automarphic number");
        }
    }
}
