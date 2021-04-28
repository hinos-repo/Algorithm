package stack;

import java.util.Stack;

public class StackExample
{
    public static void main(String [] args)
    {
        Stack<String> stack = new Stack<>();
        MyStack myStack = new MyStack();
        for (int i = 1; i <= 5; i++)
        {
            stack.push(String.valueOf(i));
            myStack.push(String.valueOf(i));
        }
        System.out.println(stack.empty());
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.search("6"));
        System.out.println(stack.search("1"));
        stack.clear();
        System.out.println(stack);

        System.out.println();
        System.out.println();

        System.out.println(myStack.empty());
        System.out.println(myStack.peek());
        System.out.println(myStack);
        System.out.println(myStack.pop());
        System.out.println(myStack);
        System.out.println(myStack.search("6"));
        System.out.println(myStack.search("1"));
        myStack.clear();
        System.out.println(myStack);
    }
}
