// basic code of class and object

class program1{
    int x=10;
    int y=20;
    void display(){
        System.out.println(x);
        System.out.println(y);
    }
    public static void main(String args[]){
        program1 obj=new program1();
        obj.display();
        System.out.println(obj.x);
        System.out.println(obj.y);
    }
}
