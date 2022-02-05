
public class Main {
    public static void main(String[] args) {

        /* zad.3
        a) stworzyć 2 objekty typu Student i uzupełnić wszystkie pola,
        b) stworzyć 2 objekty typu Pracownik i uzupełnić wszystkie pola,
        c) wypisać metody toString() wszystkich objektów,
        */
        Student student1 = new Student("Jan", "Nowak", 43567, 3, "Informatyka");
        Student student2 = new Student("Jan", "Kowalski", 68679, 4, "Zarządzanie");

        System.out.println("Studenci:");
        System.out.println(student1);
        System.out.println(student2);

        Pracownik pracownik1 = new Pracownik("Krzysztof", "Urbaniak", "Informatyk", "Umowa o prace", 3400.00);
        Pracownik pracownik2 = new Pracownik("Dawid", "Koperfildowski", "Komornik", "Umowa o prace", 6700.00);

        System.out.println("Pracownicy:");
        System.out.println(pracownik1);
        System.out.println(pracownik2);


    }
}
