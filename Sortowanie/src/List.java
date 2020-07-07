

public class List<T>
{
    Element<T> first;
    Element<T> current;

    public List()
    {
        first = new Element<T>(null);
        current = first;
    }

//    public List(Element<T> first)
//    {
//        this.first = first;
//        current = first;
//    }
//
//    public List(T first)
//    {
//        this.first = new Element<T>(first);
//        current = this.first;
//    }

    public void addNext(T next)
    {
        current.addNext(new Element<T>(next));
        current = current.next;
    }

    public void addNext(Element<T> next)
    {
        current.addNext(next);
        current = next;
    }


    public Iterator<T> iterator() {
        return new Iterator<T>(first);

    }


}
