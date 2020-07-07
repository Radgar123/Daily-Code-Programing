public class InsertSort
{
    private  int swapCount=0;
    private Student[] tab;
    private  Comparator<Student> comparator;

    public InsertSort(Comparator<Student> comparator)
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

        for(int i=1;i<tabSort.length;i++)
        {
            int j=i-1;
            Student klucz=tab[i];
            for(;j>=0 && comparator.compare(tab[j],klucz)>0;j--)
            {
                swapCount++;
                tab[j+1]=tab[j];
            }

            tab[j+1] = klucz;
        }

        return tab;
    }
}
