public class ArrayDemo2 {
    public static void main(String[] args) {
        String[] Monate ={"Januar", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember" };
        System.out.println(Monate.length);
        for(int i = 0; i< Monate.length; i++){
            System.out.println(Monate[i] + "[" + (i+1) + "]");
        }
    }
}
