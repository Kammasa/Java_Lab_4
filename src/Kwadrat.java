/* zad.2
        a) stworzyć klasę kwadrat i prostokat które będą dziedziczyć po klasie Figura
        b) zaimplementować metody abstrakcyjne odpowiednimi wzorami,

 */
public class Kwadrat extends Figura {
    private double bok;
    public Kwadrat(double bok) {
        this.bok = bok;
    }
    public double getBok() {
        return bok;
    }

    public void setBok(double bok) {
        this.bok = bok;
    }
    @Override
    double pole() {
        return (bok * bok);
    }

    @Override
    double obwód() {
        return (4 * bok);
    }

}
