
/* zad.2
        a) napisać klasę Dom implementującą interfejs Budynek,
        b) zaimplementować wszystkie metody,
        c) stworzyć brakujące pola(prywatne), gettery i settery, napisać metodę toString
        (gettery i settery najlepiej wygenerować: Code/Prawy myszy --> Generate --> getters/setters/toString)
        d) stworzyć jedną dowolną metodę przez siebie (nie deklarujemy tej metody w interfejsie),
        */
public class Dom implements Budynek {
        private double metraz;
        private String adres;
        private int ileOkien;
        private int iluMieszkancow;
        private KolorEnum kolor;
        private int rokOddania;
        private int biezacyRok;

        public Dom(double metraz, String adres, int ileOkien, int iluMieszkancow, KolorEnum kolor, int rokOddania, int biezacyRok) {
            this.metraz = metraz;
            this.adres = adres;
            this.ileOkien = ileOkien;
            this.iluMieszkancow = iluMieszkancow;
            this.kolor = kolor;
            this.rokOddania = rokOddania;
            this.biezacyRok = biezacyRok;
        }

        public Dom() {
        }

        @Override
        public double powierzchnia(double metraz) {
            this.metraz = metraz;
            return metraz;
        }

        @Override
        public String adresBudynku(String adres) {
            this.adres = adres;
            return adres;
        }

        @Override
        public int liczbaOkien(int ileOkien) {
            this.ileOkien = ileOkien;
            return ileOkien;
        }

        @Override
        public void liczbaMieszkancow(int iluMieszkancow) {
            this.iluMieszkancow = iluMieszkancow;
        }

        @Override
        public void kolorDomu(KolorEnum kolor) {
            this.kolor = kolor;
        }

        @Override
        public int wiekDomu(int biezacyRok, int rokOddania) {
            this.biezacyRok = biezacyRok;
            this.biezacyRok = rokOddania;
            return biezacyRok - rokOddania;
        }

        public double getmetraz() {
            return metraz;
        }

        public void setmetraz(double metraz) {
            this.metraz = metraz;
        }

        public String getAdres() {
            return adres;
        }

        public void setAdres(String adres) {
            this.adres = adres;
        }

        public int getIleOkien() {
            return ileOkien;
        }

        public void setIleOkien(int ileOkien) {
            this.ileOkien = ileOkien;
        }

        public int getIluMieszkancow() {
            return iluMieszkancow;
        }

        public void setIluMieszkancow(int iluMieszkancow) {
            this.iluMieszkancow = iluMieszkancow;
        }

        public KolorEnum getKolor() {
            return kolor;
        }

        public void setKolor(KolorEnum kolor) {
            this.kolor = kolor;
        }

        public int getrokOddania() {
            return rokOddania;
        }

        public void setrokOddania(int rokOddania) {
            this.rokOddania = rokOddania;
        }

        public int getbiezacyRok() {
            return biezacyRok;
        }

        public void setbiezacyRok(int biezacyRok) {
            this.biezacyRok = biezacyRok;
        }

        @Override
        public String toString() {
            return "\nBudynek o powierzchni całkowitej: " + metraz + " m2\n" +
                    "Lokalizacja: " + adres + "\n" +
                    "Liczba mieszkańców: " + iluMieszkancow + "\n" +
                    "Ilość okien: " + ileOkien + "\n" +
                    "Kolor Domu: " + kolor + "\n" +
                    "Rok oddania do Użytku: " + rokOddania +
                    " -> wiek budynku: " + (biezacyRok - rokOddania) + Wiek();
        }

        public String Wiek() {
            if (biezacyRok - rokOddania == 0) {
                return " Budynek w budowie";
            } else if (biezacyRok - rokOddania == 1) {
                return " rok.";
            } else if (biezacyRok - rokOddania <= 4)  {
                return " lata.";
            }
            else {
                return " lat.";
            }
        }
    }

