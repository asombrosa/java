package ds.stacks.genericIterableCode;

import java.util.Iterator;
import java.util.ListIterator;

public class Runner{
    public static void main(String[]args){
        Stack<String> stack = new Stack<>();
        stack.push("First element");
        stack.push("Second element");
        stack.push("Third element");
        stack.push("Fourth element");
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        Iterator<String> listIterator = stack.iterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
    }
}