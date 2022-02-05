import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {

        /* zad.3
        a) w klasie Main stworzyć 2 objekty typu Dom deklarując pierwszy objekt Typem Dom,
        drugi objekt typem Budynek,
        b) wykorzystać wszystkie metody do implementacji pól,
        c) wyświetlić w konsoli metodę toString (na obu objektach) opisującą zachowanie klasy Dom,
        d) sprawdzić czy idzie wywołać z obu instancji objektu (deklaracja z interfejsu i z klasy)
        metodę której nie ma zadeklarowane w interfejsie Budynek, ale jest dopisana w klassie Dom,
        */
        Dom dom = new Dom(210.00, "Ul. Sienkiewicza 71, 84-230, Rumia", 12, 5, KolorEnum.Zielony, 1982, LocalDate.now().getYear());
        System.out.println(dom);

        Budynek budynek = new Dom();
        ((Dom) budynek).setbiezacyRok(LocalDate.now().getYear());
        ((Dom) budynek).setrokOddania(2013);
        ((Dom) budynek).setKolor(KolorEnum.Biały);
        ((Dom) budynek).setmetraz(84.66);
        ((Dom) budynek).setAdres("ul. Sienkiwicza 74, 84-230, Rumia");
        ((Dom) budynek).setIluMieszkancow(4);
        ((Dom) budynek).setIleOkien(10);
        //
        System.out.println(budynek);


    }
}
