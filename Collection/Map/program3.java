// hashmap methods

import java.util.HashMap;
public class program3 {
    public static void main(String[] args) {
        HashMap hs=new HashMap();
        hs.put("rushi","ghegade");
        hs.put("abhii","gaykwad");
        hs.put("shri","kadhe");
        hs.put("kiran","shelke");

        System.out.println(hs);
        System.out.println(hs.get("shri"));
        System.out.println(hs.keySet());
        System.out.println(hs.values());
        System.out.println(hs.entrySet());
        
    }
}
