public class code1
{
    private int k;
    private int[] arr;

    public void setArray()
    {
        arr = new int[]{10,15,3,7};
        k = 17;
    }

    public void searchArray()
    {
        for (int i = 0; i <arr.length; i++)
        {
            for (int j = 0; j < arr.length; j++)
            {
                if(arr[i] + arr[j] == k)
                    System.out.println(arr[i] + " " +  arr[j] + " = " + k + " true");
               /* else
                    System.out.println("false");*/
            }
        }
    }

    public static void main(String[] args) {
        code1 c =  new code1();

        c.setArray();
        c.searchArray();
    }
}
