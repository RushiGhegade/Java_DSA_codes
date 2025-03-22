// convert StringBuffer to String(toString())
// reverse the string using stringBuffer

public class program13 {
    public static void main(String args[]){
        String str="Rushikesh";
        System.out.println(str);
        StringBuffer sb=new StringBuffer(str);

        str=sb.reverse().toString();

        System.out.println(str);

    }    
}
