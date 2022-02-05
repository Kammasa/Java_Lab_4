/* zad.1
        a) stworzyć klasę abstrakcyjną Figura
        b) stworzyć metody abstrakcyjne pole() i obwod()
        c) stworzyć zwykłą metodę nazwaFigury(String figura), która będzie zwracała tekst 'To jest figura: .....',
        */

public abstract class Figura {

        abstract double pole();

        abstract double obwód();

        public String nazwaFigury(String figura) {
            return "To jest figura: " + figura;
        }
    }

