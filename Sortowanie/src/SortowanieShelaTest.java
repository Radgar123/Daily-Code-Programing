public class SortowanieShelaTest
{
    public static void main(String[] args)
    {
        Student[] tabStudent =
                {
                        new Student(1,"Prezes","Jan",400),
                        new Student(6,"Prezes","Filip", 1000),
                        new Student(15,"Cebulak","Wojtek",300),
                        new Student(4,"Szczypiorniak","Grzegorz", 500),
                        new Student(9,"Szklanek","Krzysiek",600),
                        new Student(13,"Nawrocki","Dariusz", 700),
                        new Student(40,"Kolanek","Piotrek",800),
                        new Student(8,"Bera","Jakub", 2000),
                        new Student(19,"Kolinek","Stefan",900),
                        new Student(10,"Magazyn","Janina", 1100),
                };

        NaturalComparator<Student> naturalny = new NaturalComparator<Student>();
        ReverseComparator<Student> odwrotnyStypendium = new ReverseComparator<Student>(new StypendiumComparator<Student>());
        ReverseComparator<Student> odwrotnyImie= new ReverseComparator<Student>(new ImieComparator<Student>());
        NazwiskoComparator<Student> nazwisko = new NazwiskoComparator<Student>();
        ComparatorZlozony<Student> zlozony = new ComparatorZlozony<Student>();

        zlozony.addComparator(nazwisko);
        zlozony.addComparator(odwrotnyImie);


        SortowanieShela sor = new SortowanieShela(zlozony);

        sor.Sortuj(tabStudent);

        System.out.println("Liczba Porownan: " + sor.getCompareCount()+" Liczba zamian: "+sor.getSwapCount());

        for (int i=0;i<tabStudent.length;i++)
        {
            System.out.println(tabStudent[i]);
        }
    }
}
