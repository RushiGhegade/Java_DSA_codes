// 1--40  number is divided by  3 & 4 then break the loop;


public class break3 {
    public static void main(String args[]){

        for(int i=1;i<=40;i++){
            if(i%3==0&&i%5==0){
                break;
            }
            System.out.println(i);
        }
    }
}
