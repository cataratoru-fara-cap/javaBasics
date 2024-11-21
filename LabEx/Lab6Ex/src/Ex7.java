public class Ex7 {
    public static String inverser( String str){
        if (str.length() == 1)
            return str;
        String droit = str.substring(0, str.length()/2);
        String gauche = str.substring(str.length()/2, str.length());
        return inverser(gauche) + inverser(droit);
    }
    public static void main(String[] args) {
        System.out.println(inverser("gabi"));
    }
}
