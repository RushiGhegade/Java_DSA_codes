
class Match{
    void matchType(){
        System.out.println("oneDayMatch / T20 / TEST");
    }
}
class Ipl extends Match{
    void matchType(){
        System.out.println("T20");
    }
}
class TestMatch extends Match{
    void matchType(){
        System.out.println("TEST");
    }
}

public class program8 {
    public static void main(String[] args) {
        Match obj=new Ipl();
        obj.matchType();

        Match obj1=new TestMatch();
        obj1.matchType();
    }    
}
