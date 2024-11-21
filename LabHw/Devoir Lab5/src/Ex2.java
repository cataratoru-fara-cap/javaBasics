public class Ex2 {
    public static void dessinerLigne (int nm, int nt, int nb){
        String ligne = "";
        String comp = ""; 
        for (int i = 1; i <= nt; i++)
            comp += "-";

        for (int i = 1; i <= nb; i++)
            comp += " ";

        for (int i = 1; i <= nm; i++)
            ligne += comp;    
        
            System.out.println(ligne);

    }
    public static void main(String[] args) {
        dessinerLigne(2, 1, 1);
        
    }
}
