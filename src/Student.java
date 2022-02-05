/* zad.2
        a) napisać klasę Student która będzie implementować interfejs StudentI,
        b) napisać klasę Pracownik która będzie implementować interfejs PracownikI,
        c) stworzyć pola, gettery i settery, metodę toString dla obu klas, (constructor z przeciążeniem - jak ktoś chce ),
        (gettery i settery / toString() ..., najlepiej wygenerować:
        --Code/Prawy myszy-->Generate-->getters/setters/toString),
        */
public class Student implements Student1 {
    private String imie;
    private String nazwisko;
    private int numerAlbumu;
    private int rokStudiow;
    private String kierunek;

    public Student(String imie, String nazwisko, int numerAlbumu, int rokStudiow, String kierunek) {

        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerAlbumu = numerAlbumu;
        this.rokStudiow = rokStudiow;
        this.kierunek = kierunek;
    }

    @Override
    public String imie(String imie) {
        this.imie = imie;
        return imie;
    }

    @Override
    public String nazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
        return nazwisko;
    }

    @Override
    public int numerAlbumu(int numerAlbumu) {
        this.numerAlbumu = numerAlbumu;
        return numerAlbumu;
    }

    @Override
    public int rokStudiow(int rokStudiow) {
        this.rokStudiow = rokStudiow;
        return rokStudiow;
    }

    @Override
    public String kierunek(String kierunek) {
        this.kierunek = kierunek;
        return kierunek;
    }

    @Override
    public String toString() {
        return "Student: " + imie + " " + nazwisko + " " + " , Numer albumu: " + numerAlbumu +
                ", kierunek: " + kierunek + ", Rok studiów: " + rokStudiow;
    }
}

