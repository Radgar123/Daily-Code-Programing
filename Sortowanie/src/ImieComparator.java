//import java.util.Comparator;

public class ImieComparator <T extends Comparable<? super T>> implements Comparator<T> {
    private  int count=0;

    @Override
    public int compare(T t, T t1)
    {

        count++;
     if(t instanceof Student && t1 instanceof Student)
         return ((Student)t).getImie().compareTo(((Student)t1).getImie());
     else
         return 0;
    }

    public int ResetCounter()
    {
        return count=0;
    }

    public  int getCount() {
        return count;
    }
}
