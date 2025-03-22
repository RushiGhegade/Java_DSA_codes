class Player{
    private int jrno=0;
    private String name=null;

    Player(int jrno ,String name){    //Player(Player this,int jrno ,String name);
        this.jrno=jrno;
        this.name=name;
        System.out.println("in constructor");
    }
    void fun(){
        System.out.println(jrno+"="+name);
    }
}

public class program7 {
    public static void main(String[] args) {
        Player obj=new Player(7,"MSD");
        obj.fun();
        Player obj2=new Player(18,"VIRAT");
        obj.fun();
        Player obj3=new Player(45,"ROHIT");
        obj.fun();
    }
}
