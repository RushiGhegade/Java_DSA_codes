// stack

import java.util.*;
public class program2 {
    public static void main(String args[]){
        Stack s=new Stack();
        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println(s);

        System.out.println(s.pop());        // pop => return & remove;
        System.out.println(s.peek());      // peek => return;

        System.out.println(s.search(10));     // top to bottem index
    }
}
