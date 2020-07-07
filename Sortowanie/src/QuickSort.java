public class QuickSort
{
    private  int swapCount=0;
    private Student[] tab;
    private  Comparator<Student> comparator;

    public QuickSort(Comparator<Student> comparator)
    {
        this.comparator = comparator;
    }


    public  int getSwapCount() {
        return swapCount;
    }

   public  int getCompareCount()
   {
       return comparator.getCount();
   }

    public void swap(int index1 , int index2)
    {
        swapCount++;
        Student tym = tab[index1];
        tab[index1] = tab[index2];
        tab[index2] = tym;
    }

    public int resetCount()
    {
        comparator.ResetCounter();
        return swapCount=0;
    }

    public Student[] Sortuj(Student[] tabSort)
    {
        resetCount();
        tab = tabSort;
        SortujSzybko(0,tab.length-1);
        return tab;
    }

    private void SortujSzybko(int low, int high)
    {
        Student pivot = tab[(low + high)/2];

        int i=low;
        int j=high;

        do {
            while (comparator.compare(tab[i],pivot)<0)
                i++;

            while (comparator.compare(tab[j],pivot)>0)
                j--;

            if(i<=j)
            {
                swap(i,j);
                i++;
                j--;
            }


        }while(i<=j);


        if(j>low)
            SortujSzybko(low,j);

        if(i<high)
            SortujSzybko(i,high);

    }

}
