
// calculate electricity bill;


import java.util.Scanner;
class conditional_1{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        int unit;
        System.out.println("enter the unit of the electricity :");
        unit=sc.nextInt();

        if(unit<=100){
            System.out.println(unit*1+" price per unit is 1");//electricity <100 per unit is 1 therefore [unit*1] apply
        }else{
            System.out.println((100*1)+(unit-100)*2+" more then 1000 per unit charge is 2:");//(100*1)=first 100 unit calculate bcuse else condition is greter then 100;
            //(unit*2) == more then 100 per unit is 2  &&  alrady (fist 100 is calculate then - from unit);

        }

    }

    public static class loops_2 {
        public static void main(String args[]){
            int x=1;
            x=x++;      // don't write same oprator on same line;

            System.out.println(x);

            /*

            // this is work on internaly

            if post(int x){
                int temp=x;
                x=x+1;
                System.out.println(x);
            }
             */
        }
    }

    public static class loop2_3 {
        public static void main(String[] args) {
            int num=10;
            System.out.println(1%2);
            int x=1;
            while(x<=10){
                if(x%2!=0) {
                    System.out.println(x);
                }
                x++;
            }
        }
    }
}
