package data.structure.queue;

abstract class AbstractQueue
{
    abstract public void offer(Object element);
    abstract public Object remove();
    abstract public Object poll();
    abstract public Object peek();
}
