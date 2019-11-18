public class Distance {

    public static void main(String[] args)
    {
        double km = 3.0;
        System.out.println(km + " km sind " + km2Landmiles(km) + " miles");
    }

     public static double km2Landmiles (double km)
     {
         double miles = km * 0.6214;
        return miles;
     }






}
