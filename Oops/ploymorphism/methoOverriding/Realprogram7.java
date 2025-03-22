// real time example on method overloading

class Ipl{
    void matchinfo(String team1,String team2){
        System.out.println(team1+"vs"+team2);
    }
    void matchinfo(String team1,String team2,String venue){
        System.out.println(team1+"vs"+team2);
        System.out.println("venue "+ venue);
    }
}
public class Realprogram7 {
    public static void main(String[] args) {
        
    
       Ipl obj=new Ipl();
        obj.matchinfo("CSK","GT");
        obj.matchinfo("CSK","GT","NMSA");
    }
}
