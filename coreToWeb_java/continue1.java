// continue is use to skip the vallue current ;

//  WAP to to skip 1-40  divided by 3 values all

public class continue1 {
    public static void main(String[] args) {

        for(int i=1;i<=40;i++){
            if(i%3!=0){
                continue;
            }
            System.out.println(i);
        }
    }
}
