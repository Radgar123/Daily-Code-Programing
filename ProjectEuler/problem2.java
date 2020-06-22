/*
Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */

public class problem2
{
    private int previous;
    private int current;
    private int actual;
    private int sum;

    public void Fibonacci(int n)
    {
        previous = 1;
        current = 0;

        sum = 0;

        System.out.println("Fibonacci sequence");
        while (actual < n )
        {
            actual = previous + current;
            previous = current;
            current = actual;

            if(current < n)
            {
                System.out.println(current);
                sum+= current;
            }
            else
                break;
        }
        System.out.println("Sum of numbers");
        System.out.println(sum);
    }

    public static void main(String[] args) {
        problem2 p = new problem2();

        p.Fibonacci(4000000);
    }
}