public class BubbleSort
{
    private  int swapCount=0;
    private Student[] tab;
    private  Comparator<Student> comparator;

    public BubbleSort(Comparator<Student> comparator)
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

        for(int i=0;i<tab.length;i++)
        {
            for(int j=0;j<tab.length-1;j++)
            {
                if ( comparator.compare(tab[j] , tab[j+1])>0)
                {
                    swap(j,j+1);
                }
            }
        }

        return tab;
    }


}
