package linked;

import java.util.LinkedList;

public class MyLinkedList extends AbstractLinked
{
    private Node head;
    private int listSize = 0;

    @Override
    void clear()
    {
        LinkedList
        if (size() == 0)
        {
            return;
        }

        listSize = 0;
    }

    @Override
    void add(Object element)
    {
        isCheckException();

        Node newNode = new Node(element);
        if (listSize == 0)
        {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        listSize++;
    }

    @Override
    void add(int position, Object element)
    {
        Node newNode = new Node(element);
        Node temp = getNode(position);
        newNode.next = temp.

    }

    @Override
    void remove(int position)
    {
        isCheckException(position);

    }

    @Override
    Object get(int position)
    {
        return getNode(position).getData();
    }

    @Override
    int size()
    {
        return listSize;
    }

    private Node getNode(int position)
    {
        isCheckException(position);

        Node node = head;
        if (position == 0)
        {
            return node;
        } else {
            for (int i = 1; i<=position; i++)
            {
                node = node.next;
            }
        }
        return getNode(position);
    }

    private void isCheckException(int position)
    {
        if (size() < 0 || position < 0)
        {
            throw new IndexOutOfBoundsException();
        }
    }
    private void isCheckException()
    {
        if (size() < 0)
        {
            throw new IndexOutOfBoundsException();
        }
    }
}
