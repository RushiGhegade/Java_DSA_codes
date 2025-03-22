// real time example Constructor

class Project{
    int emp=20;
    String projectName="online education";

    void clientInfo(){
        String clientName="rushi";
        System.out.println("no of employee :"+emp);
        System.out.println("project name :"+projectName);
        System.out.println("client name :"+clientName);
    }
}

public class program2 {
    public static void main(String args[]){
        Project obj=new Project();
        obj.clientInfo();
    }
}
