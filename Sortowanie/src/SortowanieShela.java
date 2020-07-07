public class SortowanieShela
{
    private  int swapCount=0;
    private Student[] tab;
    private  Comparator<Student> comparator;
    private static int gaps[] = {427856, 171142, 68457, 27382, 10953, 4381, 1753, 701, 301, 132, 57, 23, 10, 4, 1};

    public SortowanieShela(Comparator<Student> comparator)
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

        for(int i=0;i<gaps.length;i++)
        {
            for (int j=gaps[i];j<tab.length;j++)
            {
                Student klucz = tab[j];
                int k = j - gaps[i];

                while (k>=0 && comparator.compare(tab[k],klucz)>0)
                {
                    swapCount++;
                    tab[k+gaps[i]] = tab[k];
                    k-=gaps[i];
                }
                tab[k+gaps[i]] = klucz;
                swapCount++;
            }

        }

        return tab;
    }


}
