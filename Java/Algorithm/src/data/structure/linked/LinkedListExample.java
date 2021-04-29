package data.structure.linked;

public class LinkedListExample
{
    public static void main(String [] args)
    {
        MyLinkedList mylist = new MyLinkedList();
        for (int i = 0; i < 10; i++)
        {
            mylist.add(i);
        }

        mylist.add(8, 100);
        mylist.add(3, 100);

        System.out.println(mylist.toString());

        mylist.remove(8);
        mylist.remove(3);

        System.out.println(mylist.toString());

        mylist.clear();

        System.out.println(mylist.toString());
    }
}
