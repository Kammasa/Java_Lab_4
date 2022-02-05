/*
        e) napisać interfejs PracownikI który dziedziczy po interfejsie CzlowiekI,
        f) zadeklarować 3 metody,

         */
public interface Pracownik1 extends Czlowiek1 {

    String Stanowisko(String Stanowisko);

    String rodzajZatrudnienia(String rodzajZatrudnienia);

    double wypłata(double wypłata);
}

