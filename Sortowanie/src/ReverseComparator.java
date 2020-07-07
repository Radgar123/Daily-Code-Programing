//import java.util.Comparator;

public class ReverseComparator <T extends Comparable<? super T>> implements Comparator<T>
{
    private  int count=0;

    private final Comparator<T> _comparator;
    public ReverseComparator(Comparator<T> comparator) {
        _comparator = comparator; }
    @Override
    public int compare(T left, T right) {
        count++;
        return _comparator.compare(right, left); }


    public int ResetCounter()
    {
        return count=0;
    }

    public  int getCount() {
        return count;
    }
}

