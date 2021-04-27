package linked;


class Node
{
    private Object data;
    Node next;

    public Node(Object data)
    {
        this.data = data;
        next = null;
    }

    public Object getData()
    {
        return data;
    }

    @Override
    public String toString()
    {
        return String.valueOf(data);
    }
}
