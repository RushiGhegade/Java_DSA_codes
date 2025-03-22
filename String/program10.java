// StringBuffered

class program10{
    public static void main(String args[]){
        StringBuffer str=new StringBuffer("Rushi");
        System.out.println(System.identityHashCode(str));

        str=str.append("Ghegade");            // StringBuffer fuction

        System.out.println(System.identityHashCode(str));
    }
}