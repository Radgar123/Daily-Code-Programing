import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class SortowanieShelaTestElementy
{
    public static void main(String[] args) throws FileNotFoundException
    {
        PrintWriter save = new PrintWriter("ShellSort.txt");

        Random random = new Random();
        String[] letters ={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","p","q","r","s","t","u","w","y","z"};


        int n = 1000;


        Student[] tabStudent1 = new  Student[n];

        for (int i=0;i<tabStudent1.length;i++)
        {
            int index = random.nextInt(letters.length);
            String imie = letters[index];
            int index1 = random.nextInt(letters.length);
            String nazwisko = letters[index1];

            tabStudent1[i] = new Student(random.nextInt(n+1),imie,nazwisko,random.nextInt(1000));
        }


//        Student[] tabStudent =
//                {
//                        new Student(1,"Prezes","Jan",400),
//                        new Student(6,"Prezes","Filip", 1000),
//                        new Student(15,"Cebulak","Wojtek",300),
//                        new Student(4,"Szczypiorniak","Grzegorz", 500),
//                        new Student(9,"Szklanek","Krzysiek",600),
//                        new Student(13,"Nawrocki","Dariusz", 700),
//                        new Student(40,"Kolanek","Piotrek",800),
//                        new Student(8,"Bera","Jakub", 2000),
//                        new Student(19,"Kolinek","Stefan",900),
//                        new Student(10,"Magazyn","Janina", 1100),
//                };


        NaturalComparator<Student> naturalny = new NaturalComparator<Student>();
        ReverseComparator<Student> odwrotnyStypendium = new ReverseComparator<Student>(new StypendiumComparator<Student>());
        ReverseComparator<Student> odwrotnyImie= new ReverseComparator<Student>(new ImieComparator<Student>());
        NazwiskoComparator<Student> nazwisko = new NazwiskoComparator<Student>();
        ComparatorZlozony<Student> zlozony = new ComparatorZlozony<Student>();

        zlozony.addComparator(nazwisko);
        zlozony.addComparator(odwrotnyImie);


        SortowanieShela sor = new SortowanieShela(odwrotnyStypendium);

        sor.Sortuj(tabStudent1);

        save.println("Liczba Porownan: " + sor.getCompareCount()+" Liczba zamian: "+sor.getSwapCount());

        for (int i=0;i<tabStudent1.length;i++)
        {
            save.println(tabStudent1[i]);
        }
        save.close();
    }
}
