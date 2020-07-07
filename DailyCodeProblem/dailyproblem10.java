import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class dailyproblem10
{
    private Timer timer;

    public class Time extends TimerTask
    {
        public void run()
        {
            System.out.format("Time's up");
            timer.cancel();
        }
    }

    public dailyproblem10(int seconds)
    {
        timer = new Timer();
        timer.schedule(new Time(),seconds/100);
    }


    public static void main(String[] args)
    {
        new dailyproblem10(100);
        System.out.format("Task scheduled.%n");
    }
}
