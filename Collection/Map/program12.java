
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
public class program12 {
    public static void main(String args[]) throws IOException{
            Properties obj=new Properties();
            FileInputStream fobj=new FileInputStream("friend.text");
            obj.load(fobj);

            String name=obj.getProperty("Rushi");
            System.out.println(name);

            obj.setProperty("shashi","Biencaps");

            FileOutputStream oobj=new FileOutputStream("friend.text");

            obj.store(oobj,"Updated By Rushi");
    }
}
