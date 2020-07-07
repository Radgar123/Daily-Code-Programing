//import java.util.Comparator;

public class StypendiumComparator<T extends Comparable<? super T>> implements Comparator<T> {

    private  int count=0;

    @Override
    public int compare(T t, T t1) {
        count++;
        if (t instanceof Student && t1 instanceof Student) {

            if (((Student) t).getKwota() < ((Student) t1).getKwota())
                return -1;
            else if (((Student) t).getKwota() > ((Student) t1).getKwota())
                return 1;
            else
                return 0;
        } else
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


