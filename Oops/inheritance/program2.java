// inheritance program

class parent{
    parent(){
        System.out.println("in parent constructor");
    }
    void parent_property(){
        System.out.println("gold,flat,car");
    }
}

class child extends parent{
    child(){
        System.out.println("in child constructor");
    }
}

public class program2 {
    public static void main(String[] args) {
        child obj=new child();
        obj.parent_property();
    }
}
