package stack;

import java.util.Stack;

public class StackExample
{
    public static void main(String [] args)
    {
        Stack<String> stack = new Stack<>();
        System.out.println(stack.empty());
        for (int i = 1; i <= 5; i++)
        {
            stack.push(String.valueOf(i));
        }
        System.out.println(stack.empty());
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.search("6"));
        System.out.println(stack.search("1"));
    }
}
