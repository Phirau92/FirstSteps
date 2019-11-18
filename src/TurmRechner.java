public class TurmRechner {
    public static void main(String[] args) {
        int zahl = 12;
        int ergebnis = 0;
        for (int i = 2; i <= 9; i++) {
            ergebnis = zahl * i;
            System.out.println(zahl + " * " + i + " = " + ergebnis);
            zahl = ergebnis;
        }
                for (int j = 2; j <= 9; j++) {
                    ergebnis = zahl / j;
                    System.out.println(zahl + " / " + j + " = " + ergebnis);
                    zahl = ergebnis;
                }
        System.out.println(zahl);

        }
    }
