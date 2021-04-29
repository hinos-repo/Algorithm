package data.structure.queue;

import data.structure.linked.MyLinkedList;

import java.util.NoSuchElementException;

public class Myqueue extends AbstractQueue
{
    private Node first;

    @Override
    public void offer(Object element)
    {
        Node newNode = new Node(element);
        if (first == null)
        {
            first = newNode;
            return;
        }

        Node temp = first;
        while (true)
        {
            if (temp.next == null)
            {
                temp.next = newNode;
                break;
            } else {
                temp = temp.next;
            }
        }
    }

    @Override
    public Object remove()
    {
        if (first == null)
        {
            return null;
        }
        Object data = first.getData();
        first = first.next;
        return data;
    }

    @Override
    public Object poll()
    {
        if (first == null)
        {
            throw new NoSuchElementException();
        }
        Object data = first.getData();
        first = first.next;
        return data;
    }

    @Override
    public Object peek()
    {
        if (first == null)
        {
            return null;
        }
        return first.getData();
    }

    @Override
    public String toString()
    {
        MyLinkedList myList = new MyLinkedList();

        Node temp = first;
        while (temp != null)
        {
            myList.add(temp.getData());
            temp = temp.next;
        }
        return myList.toString();
    }
}
