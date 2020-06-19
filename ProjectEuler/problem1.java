
/*
Problem 1

If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

        Find the sum of all the multiples of 3 or 5 below 1000.
*/

public class problem1
{
    private int value;
    private int sum;

    public problem1()
    {
        this.value = 1;
    }

    public problem1(int value)
    {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void numbersBelow()
    {
        sum = 0;

        for (int i = 1; i < value ; i++)
        {
            if(i % 3 == 0 || i % 5 == 0)
                sum+=i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        problem1 p1 = new problem1(1000);

        p1.numbersBelow();
    }
}
