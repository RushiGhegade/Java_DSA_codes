//class and object program 

class Employee{
    int empId=10;
    String empname="kanha";
    void Employee(){
        System.out.println("Employee id :"+empId);
        System.out.println("Employee name :"+empname);
    }
}

public class program5 {
    public static void main(String[] args) {
        Employee obj=new Employee();
        obj.Employee();
        System.out.println(obj.empId);
        System.out.println(obj.empname);
    }
}
