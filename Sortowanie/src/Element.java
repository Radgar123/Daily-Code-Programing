public class Element<T>
{
    T value;
    Element<T> next;

    public Element(T value, Element<T> next)
    {
        this.value = value;
        this.next = next;
    }

    public Element(T value)
    {
        this.value = value;
        this.next = null;
    }

    public void addNext(Element<T> next)
    {
        this.next = next;
    }

    public void removeNext()
    {
        next = next.next;
    }

}
