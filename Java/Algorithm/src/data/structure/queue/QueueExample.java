package data.structure.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample
{
    public static void main(String [] args)
    {
        Queue<String> queue = new LinkedList<>();
        Myqueue myqueue = new Myqueue();

        for (int i = 0; i<5; i++)
        {
            queue.offer(String.valueOf(i));
            myqueue.offer(String.valueOf(i));
        }

        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);


        System.out.println();
        System.out.println();


        System.out.println(myqueue);
        System.out.println(myqueue.peek());
        System.out.println(myqueue.poll());
        System.out.println(myqueue);
        System.out.println(myqueue.remove());
        System.out.println(myqueue);
    }
}
