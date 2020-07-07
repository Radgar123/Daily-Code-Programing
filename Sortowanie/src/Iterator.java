public class Iterator<T>
{

    Element<T> current;

    public Iterator(Element<T> current)
    {
        this.current = current;
    }

    public boolean hasNext()
    {
        return (current.next != null);
    }

    public T next()
    {
        if(hasNext())
        {
            current = current.next;
        }
        return current.value;
    }

}
