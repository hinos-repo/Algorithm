package linked;

abstract class AbstractLinked
{
    abstract void clear();
    abstract void add(Object element);
    abstract void add(int position, Object element);
    abstract void remove(int position);
    abstract Object get(int position);
    abstract int size();
}
