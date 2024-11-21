public class Ex8 {
    public static int binarySearch(int valeur, int gauche, int droit, int[] liste) {
        int midpoint = gauche + (droit - gauche) / 2; //the cream of the algorithm
        
        if (valeur == liste[midpoint]) {
            return midpoint;
        } else if (valeur >  liste[midpoint]) {
            return binarySearch(valeur, midpoint, droit, liste);
        } else if (valeur < liste[midpoint]) {
            return binarySearch(valeur, gauche, midpoint, liste);
        }
        System.out.println("Item not in list");
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 8, 9, 12, 17};
        int searched = binarySearch(6, 0, arr.length, arr);
        System.out.println( searched );
    }
}
