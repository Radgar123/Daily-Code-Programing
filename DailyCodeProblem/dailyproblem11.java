import java.util.ArrayList;

public class dailyproblem11
{
    private String text;
    private String[] words;
    //private ArrayList patternList;
    private boolean isFound;

    public void patternInTheText()
    {
        text = "zjeb";
        words = new String[]{"Kuba","Kacper","Kaczjeb"};

        for(int i = 0; i < words.length; i++)
        {
            isFound = words[i].indexOf(text) != -1 ? true : false;

            if (isFound)
                System.out.println(words[i]);
        }
    }

    public static void main(String[] args) {
        dailyproblem11 p = new dailyproblem11();

        p.patternInTheText();
    }
}
