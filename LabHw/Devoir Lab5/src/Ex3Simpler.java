
public class Ex3Simpler {
    public static String trouverPlusLongNom( String[] tab){
        String max = tab[0];
        int max_length = max.length();

        for (int i = 1; i < tab.length; i++){
            if (tab[i].length() > max_length) {
                max = tab[i];
                max_length = tab[i].length(); 
            }
        }
        return max;
    }
     
    public static void main(String[] args) {
        String[] tab = {"Désiré ", "Albert", "André", "Bernard", "Chamile"};
        System.out.println(trouverPlusLongNom(tab));
    }
}