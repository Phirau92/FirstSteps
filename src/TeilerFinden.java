public class TeilerFinden {
    public static void main(String[] args) {
        int z = 17;
        int t = 2;
        boolean hatTeiler = false;

        while (t<z) {
            if (z%t==0) {
                System.out.println("ein ganzer Teiler ist " + t);
                hatTeiler = true;
            } t++;
        }
        if(hatTeiler == false) {
            System.out.println("Primzahl :s");
        }


    }
}
