// StringBuffer methods


class program12{
    public static void main(String args[]){

        StringBuffer str=new StringBuffer("Rushi");

        str.append(" Rutik");
        System.out.println(str);

        str.insert(5," ashish ");
        System.out.println(str);

        str.delete(5,12);
        System.out.println(str);

        str.reverse();
        System.out.println(str);
    }
}