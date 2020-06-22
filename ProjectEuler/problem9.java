public class problem9
{
    private int a;
    private int b;
    private int c;


    public void pythagoreanTriplet(int value)
    {
        for (a=0;a<=value;a++)
        {
            for(b=0;b<=value;b++)
            {
                for (c=0;c<=value;c++)
                {
                    if(Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2) &&  (a+b+c == value) && a<b && b<c )
                    {
                        System.out.println("a: " + a +" b: "+b+" c: "+c);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        problem9 p = new problem9();

        p.pythagoreanTriplet(1000);
    }
}
