// real time example class and object

class macdiee{
    int item=5;
    String product="frizz";
    void menu(){
        String menu1="VEG";
        String menu2="NON-VEG";
        System.out.println("item="+item);
        System.out.println("product="+product);
    }
}

public class program3 {
    public static void main(String[] args) {
        macdiee obj=new macdiee();
        obj.menu();
    }
}
