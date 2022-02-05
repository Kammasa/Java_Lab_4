public class Pracownik implements Pracownik1 {
    private String imie;
    private String nazwisko;
    private String Stanowisko;
    private String rodzajZatrudnienia;
    private double wypłata;

    public Pracownik(String imie, String nazwisko, String Stanowisko, String rodzajZatrudnienia, double wypłata) {

        this.imie = imie;
        this.nazwisko = nazwisko;
        this.Stanowisko = Stanowisko;
        this.rodzajZatrudnienia = rodzajZatrudnienia;
        this.wypłata = wypłata;
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
    public String Stanowisko(String Stanowisko) {
        this.Stanowisko = Stanowisko;
        return Stanowisko;
    }

    @Override
    public String rodzajZatrudnienia(String rodzajZatrudnienia) {
        this.rodzajZatrudnienia = rodzajZatrudnienia;
        return rodzajZatrudnienia;
    }

    @Override
    public double wypłata(double wypłata) {
        this.wypłata = wypłata;
        return wypłata;
    }

    @Override
    public String toString() {
        return "Pracownik: " + imie + " " + nazwisko + " " + ", Stanowisko: " + Stanowisko +
                ", rodzaj zatrudnienia: " + rodzajZatrudnienia + ", wypłata: " + wypłata;
    }
}

