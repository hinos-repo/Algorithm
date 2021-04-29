package data.structure.linked;

abstract class AbstractLinked
{
    public abstract void clear();
    public abstract void add(Object element);
    public abstract void add(int position, Object element);
    public abstract void addFirst(Object element);
    public abstract void addLast(Object element);
    public abstract void remove(int position);
    public abstract Object get(int position);
    public abstract int size();
}
