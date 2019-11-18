public class Metropolis {

    public static void main(String[] args) {
        boolean Hauptstadt = false;
        int inhabitans = 100000;
        double taxPerPersonAndMonth = 300;

        if (isMetropolis(Hauptstadt, inhabitans, taxPerPersonAndMonth)) {
            System.out.println("ist eine Metropole");
        } else {
            System.out.println("ist keine Metropole"); }
    }

    public static boolean isMetropolis(boolean isCapital, int inhabitans, double taxPerPersonAndMonth) {

        if ((isCapital) && (inhabitans >= 100000) || ((inhabitans >= 200000) && (taxPerPersonAndMonth >= (7200000 / 200000) / 12)))
        {
            return true;
        } else { return false;}
    }
}
