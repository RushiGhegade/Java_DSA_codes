// basic program constructor

class Demo{
    int x=10;
    static int y=20;
    Demo(){
        System.out.println("in Demo constructor");
        System.out.println(x);
        System.out.println(y);
    }
    void display(){
        Demo obj=new Demo();
    }
}

class program1{
    public static void main(String args[]){
        Demo obj=new Demo();
        obj.display();
    }
}