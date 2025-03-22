

class practice{
    public static void main(String[] args) {
        int x=10;
        {
            x=20;
            System.out.println(x);
        }
        System.out.println(x);
    }
}