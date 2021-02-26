package ds.stacks.usingLinkedLists;

public class Runner{
    public static void main(String[]args){
        Stack stack = new Stack();
        stack.push("First element");
        stack.push("Second element");
        stack.push("Third element");
        stack.push("Fourth element");
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
    }
}