import java.util.ArrayList;

public class Ex3et4 {
    public static ArrayList<String> trouverPlusLongNom( String[] tab){
         //cleans first name of empty spaces
        String first_name = tab[0].strip();
        int max = first_name.length();
        ArrayList<String> arr = new ArrayList<String>();
        arr.add(first_name);

        for (int i = 1; i < tab.length; i++){
            //cleans names of empty spaces
            String name = tab[i].strip(); 
            int nameLength = name.length();
            //checks to see if namelength is the same with the maximum length
            if (nameLength == max) { 
                arr.add(name);
            // checks to see if namelength is bigger and reinitialises the array and the max
            } else if (nameLength > max) {
                max = nameLength; 
                arr = new ArrayList<String>();
                arr.add(name); 
            }
        }
        return arr;
    }
     
    public static void main(String[] args) {
        String[] tab = {"Désiré ", "Albert", "André", "Bernard", "Chamile"};
        System.out.println(trouverPlusLongNom(tab));
        //Les Problemes avec des Matrices de derniere fois sont deja optimises avec des methodes (Je ecrive leurs avec des methodes de premiere fois)
    }
}
