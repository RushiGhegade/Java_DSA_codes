// real time example login page

class login{
    public String username=null;
    private int pass=0;

    void setlogin(String username,int pass){
        this.username=username;
        this.pass=pass;
    }
    void getinfo(){
        System.out.println("username="+username);
        System.out.println("pass ="+pass);
    }
    
}
class program1{
    public static void main(String[] args) {
        login obj=new login();
        
        obj.setlogin("rushikesh",1234);
        String str="rushikesh";
        if(str==obj.username){
            obj.getinfo();
        }else{
            System.out.println("invalid username ");
        }

    }
}