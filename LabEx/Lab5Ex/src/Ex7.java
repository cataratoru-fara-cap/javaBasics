public class Ex7 {
    public static int piramide(int n){
        int blocs = 0;
        for (int i = 1; i <= n; i++){
            blocs += Math.pow(i, 2);
        }
        return blocs;
    }
    public static void main(String[] args) {
        System.out.println(piramide(3));
        System.out.println(piramide(210));

    }
}
