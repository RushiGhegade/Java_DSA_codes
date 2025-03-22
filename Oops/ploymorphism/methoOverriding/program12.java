// method overriding
// in method overriding return type is matter primitive return type is same function
//primitive return type => int , float ,dubble,char,etc

class parent{
    
    char fun(){
        System.out.println("in parent fun");
        return 'A';
    }
}
class child extends parent{
    int fun(){                                   // return type matter in method overriding 
        System.out.println("in child function");
        return 10;
    }
}
public class program12 {
    public static void main(String[] args) {
        parent obj=new child();
        obj.fun();
    }
}
