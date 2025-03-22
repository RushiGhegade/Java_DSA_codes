// Stack OverFlow Error
// it is error does not handel
public class program13 {
    static void fun(int x){
        System.out.println(x);
        fun(++x);                        // recursive Function call
    }
    public static void main(String args[]){
        fun(1);
    }
}
