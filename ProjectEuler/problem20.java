/*
n! means n × (n − 1) × ... × 3 × 2 × 1
For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
Find the sum of the digits in the number 100!
*/

public class problem20
{
    private long strong;
    private long sum;

    public void factorialDigitSum(int value)
    {
        strong = 1;
        sum =0;

        while(value !=1)
        {
            strong*=value;
            value--;
        }
        System.out.println(strong);


        while (strong != 0)
        {
            sum+=strong%10;
            strong/=10;
        }
        System.out.println(sum);

    }


    public static void main(String[] args)
    {
        problem20 p = new problem20();

        p.factorialDigitSum(10);
    }
}
