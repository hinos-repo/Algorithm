package stack;

abstract class AbstractStack
{
    public abstract void clear();
    public abstract Object push(Object element);
    public abstract Object pop();
    public abstract Object peek();
    public abstract boolean empty();
    public abstract int search(Object element);
}
