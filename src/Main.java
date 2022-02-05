public class Main {

    public static void main(String[] args) {

        /* zad.1
        a) stworzyć klasę abstrakcyjną Figura
        b) stworzyć metody abstrakcyjne pole() i obwod()
        c) stworzyć zwykłą metodę nazwaFigury(String figura), która będzie zwracała tekst 'To jest figura: .....',
        */

        /* zad.2
        a) stworzyć klasę kwadrat i prostokat które będą dziedziczyć po klasie Figura
        b) zaimplementować metody abstrakcyjne odpowiednimi wzorami,
        c) stworzyć objekty tych klas i wyświetlić przykładowe wyliczenia
        */
        Kwadrat kwadrat = new Kwadrat(4);
        double poleKwadratu = kwadrat.pole();
        double obwódKwadratu = kwadrat.obwód();
        String figuraKwadrat = kwadrat.getClass().getCanonicalName();
        System.out.println(kwadrat.nazwaFigury(figuraKwadrat) +
                " o polu: " + poleKwadratu + " i obwodzie: " + obwódKwadratu);

        Prostokąt prostokąt = new Prostokąt(8, 2);
        double poleprostokąta = prostokąt.pole();
        double obwódprostokąta = prostokąt.obwód();
        String figuraProstokąt = prostokąt.getClass().getCanonicalName();
        System.out.println(kwadrat.nazwaFigury(figuraProstokąt) +
                " o polu: " + poleprostokąta + " i obwodzie: " + obwódprostokąta);
    }
}
