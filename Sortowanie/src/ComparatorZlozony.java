//import java.util.ArrayList;
//import java.util.Comparator;

public class ComparatorZlozony <T> implements Comparator<T> { //tablica komparatorów ; od najważniejszego
    private final List<Comparator<T>> _comparators = new List<Comparator<T>>();
    private  int count=0;



    public void addComparator(Comparator<T> comparator)
    {
        _comparators.addNext(comparator);
    }
    //@SuppressWarnings("unchecked")

    @Override
    public int compare(T left, T right) throws ClassCastException {
        int result = 0;

        Iterator<Comparator<T>> iterator = _comparators.iterator();

        while (iterator.hasNext()){
            Comparator<T> comp = iterator.next();
            int c=comp.getCount();
            //count++;
             result=comp.compare(left, right);
             count+=comp.getCount()-c;
             if(result!=0)
                 break;
        }
        return result;
    }

    public int ResetCounter()
    {
        return count=0;
    }

    public  int getCount() {
        return count;
    }
}

