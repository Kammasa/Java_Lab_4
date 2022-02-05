public class Prostokąt extends Figura{
    private double bokA, bokB;

    public Prostokąt(double bokA, double bokB) {
        this.bokA = bokA;
        this.bokB = bokB;
    }

    public double getBokA() {
        return bokA;
    }

    public void setBokA(double bokA) {
        this.bokA = bokA;
    }

    public double getBokB() {
        return bokB;
    }

    public void setBokB(double bokB) {
        this.bokB = bokB;
    }
    @Override
    double pole() {
        return bokA * bokB;
    }

    @Override
    double obwód() {
        return (2 * bokA) + (2 * bokB);
    }
}
