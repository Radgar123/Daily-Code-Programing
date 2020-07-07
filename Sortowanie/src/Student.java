public class Student implements Comparable<Student>
{
    private int index;
    private String nazwisko, imie;
    private double kwota;

    public Student()
    {
        this.index = 1;
        this.nazwisko = "Kowalski";
        this.imie = "Jan";
        this.kwota = 460;
    }

    public Student(int index, String nazwisko, String imie, double kwota)
    {
        this.index = index;
        this.nazwisko = nazwisko;
        this.imie = imie;
        this.kwota = kwota;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setKwota(double kwota) {
        this.kwota = kwota;
    }

    public int getIndex() {
        return index;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public double getKwota() {
        return kwota;
    }


    @Override
    public int compareTo(Student other) {
        if (index < other.index)
            return -1;
        else if(index > other.index)
            return 1;
        else
            return 0;
    }

    @Override
    public boolean equals(Object other)
    {
        return other instanceof Student && ((Student) other).index == index;
    }

    public String toString()
    {
        return ""+ index + " " + nazwisko + " " + imie + " " + kwota;
    }


}
