package linked;

public class LinkedListExample
{
    public static void main(String [] args)
    {
        MyLinkedList mylist = new MyLinkedList();
        for (int i = 0; i < 10; i++)
        {
            mylist.add(i);
        }
        for (int i = 0; i < mylist.size(); i++)
        {
            System.out.println(mylist.get(i));
        }
    }
}
