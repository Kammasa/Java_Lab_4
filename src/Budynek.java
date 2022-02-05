
/* zad.1
        a) Stwożyć interfejs Budynek,
        b) interfejs powinien mieć metody:
            - double powierzchnia(double powBudynku, double powPodworka, double powParkingu);
            - String adresBudynku(String miejscowosc, String ulica, int nrDomu, String nrLokalu, String kodPocztowy);
            - void liczbaOkien(int value); // użycie jak setter
            - void liczbaMieszkancow(int value); // użycie jak setter
            - void kolorDomu(KolorEnum kolor); // użycie jak setter
            - double wyliczCene(double powierzchnia, double cena);
        c) stworzyć enum KolorEnum z przykładowymi kolorami,
        d) stworzyć jedną metodę z 2 parametrami wymyśloną przez siebie,
        */
public interface Budynek {

        double powierzchnia(double metraz);

        String adresBudynku(String adres);

        int liczbaOkien(int ileOkien);

        void liczbaMieszkancow(int iluMieszkancow);

        void kolorDomu(KolorEnum kolor);

        int wiekDomu(int biezacyRok, int rokOddania);
    }

