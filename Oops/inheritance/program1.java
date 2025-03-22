// real time example inheritance

class icc{
    icc(){
        System.out.println("in icc Constructor");
    }
}
class bcci extends icc{
    bcci(){
        System.out.println("in bcci constructor");
    }
}

class program1{
    public static void main(String[] args) {
        bcci obj=new bcci();    
    }
}