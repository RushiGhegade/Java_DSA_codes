// comparator 
// use foe userdefine function to sort
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Employee{
    String name=null;
    float sal=0.0f;
    Employee(String name,float sal){
        this.name=name;
        this.sal=sal;
    }
    public String toString(){
        return name+":"+sal;
    }
}
class sortname implements Comparator{
    public int compare(Object obj1,Object obj2){
        return (((Employee)obj1).name).compareTo(((Employee)obj2).name);
    }
}
class sortsal implements Comparator{
    public int compare(Object obj1,Object obj2){
        return (int)(((Employee)obj1).sal-((Employee)obj2).sal);
    }
}
class program3{
    public static void main(String args[]){
        ArrayList al=new ArrayList();
        al.add(new Employee("rushi",100.0f));
        al.add(new Employee("ashish",400.0f));
        al.add(new Employee("rahul",200.0f));
        al.add(new Employee("shashi",700.0f));
        System.out.println(al);

        Collections.sort(al,new sortname());
        System.out.println(al);

        Collections.sort(al,new sortsal());
        System.out.println(al);
    }
}