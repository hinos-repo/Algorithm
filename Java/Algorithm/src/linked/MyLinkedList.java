package linked;

public class MyLinkedList extends AbstractLinked
{
    private Node head;
    private Node tail;
    private int listSize = 0;


    @Override
    void clear()
    {
        head = null;
        tail = null;
        listSize = 0;
    }

    @Override
    void add(Object element)
    {
        addLast(element);
    }

    @Override
    void add(int position, Object element)
    {
        isCheckException(position);
        if (position == 0)
        {
            addFirst(element);
            return;
        }

        Node newNode = new Node(element);

        Node prevNode = getNode(position-1);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
        if (newNode.next == null)
        {
            tail = newNode;
        }
        listSize++;
    }

    @Override
    void addFirst(Object element)
    {
        Node newNode = new Node(element);
        if (head == null)
        {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        if (head.next == null)
        {
            tail = newNode;
        }
        listSize++;
    }

    @Override
    void addLast(Object element)
    {
        isCheckException();
        if (listSize == 0)
        {
            addFirst(element);
            return;
        }
        Node newNode = new Node(element);
        tail.next = newNode;
        tail = newNode;
        listSize++;
    }

    @Override
    void remove(int position)
    {
        isCheckException(position);

        Node rvNode = getNode(position);
        if (position == 0)
        {
            head = head.next;
        } else {
            Node prevNode = getNode(position-1);
            prevNode.next = rvNode.next;
            if (prevNode.next == null)
            {
                tail = prevNode;
            }
        }
        listSize--;
    }

    @Override
    Object get(int position)
    {
        isCheckException(position);
        return getNode(position).getData();
    }

    @Override
    int size()
    {
        return listSize;
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i<size(); i++)
        {
            builder.append(get(i).toString());
            if (i != size()-1)
            {
                builder.append(", ");
            }
        }
        builder.append("]");
        return builder.toString();
    }

    private Node getNode(int position)
    {
        isCheckException(position);
        if (position == 0)
        {
            return head;
        }
        Node node = head;
        for (int i = 0; i<position; i++)
        {
            node = node.next;
        }
        return node;
    }

    private void isCheckException(int position)
    {
        if (size() < 0 || size() < position || position < 0)
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
