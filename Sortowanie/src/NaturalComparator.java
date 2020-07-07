//import java.util.Comparator;

public class NaturalComparator<T extends Comparable<? super T>> implements Comparator<T>
{
    private  int count=0;
    @Override
    public int compare(T o1, T o2)
    {
        count++;
        return o1.compareTo(o2);
    }

    public int ResetCounter()
    {
        return count=0;
    }

    public  int getCount() {
        return count;
    }
}
