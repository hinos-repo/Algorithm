package stack;

import linked.MyLinkedList;

import java.util.EmptyStackException;

public class MyStack extends AbstractStack
{
    private Node top;

    @Override
    public void clear()
    {
        top = null;
    }

    @Override
    public Object push(Object element)
    {
        Node newNode = new Node(element);
        newNode.next = top;
        top = newNode;
        return element;
    }

    @Override
    public Object pop()
    {
        if (top == null)
        {
            throw new EmptyStackException();
        }
        Node temp = top;
        top = top.next;
        return temp.getData();
    }

    @Override
    public Object peek()
    {
        if (top == null)
        {
            throw new EmptyStackException();
        }
        return top.getData();
    }

    @Override
    public boolean empty()
    {
        return top == null;
    }

    @Override
    public int search(Object element)
    {
        if (top == null)
        {
            throw new EmptyStackException();
        }
        int i = 1;
        Node temp = top;
        while (temp != null)
        {
            if (temp.getData().equals(element))
            {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    @Override
    public String toString()
    {
        MyLinkedList myList = new MyLinkedList();

        Node temp = top;
        while (temp != null)
        {
            myList.addFirst(temp.getData());
            temp = temp.next;
        }
        return myList.toString();
    }
}
