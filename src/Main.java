public class Main {

    public static void main(String[] args) {

        /*
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
